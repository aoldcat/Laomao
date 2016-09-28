package com.laomao.base;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by laomao on 16/9/28.
 */

public class RxManager {
    public RxBridge mRxBridge = RxBridge.$();
    private Map<String, Observable<?>> mObservables = new HashMap<>();// 源
    private CompositeSubscription mCompositeSubscription = new CompositeSubscription();// 订阅者

    public void on(String eventName, Action1<Object> action) {
        Observable<?> observable = mRxBridge.register(eventName);
        mObservables.put(eventName, observable);
        mCompositeSubscription.add(observable.observeOn(AndroidSchedulers.mainThread()).subscribe(action, (throwable -> throwable.printStackTrace())));
    }

    public void add(Subscription subscription) {
        mCompositeSubscription.add(subscription);
    }

    public void remove() {
        mCompositeSubscription.unsubscribe();
        for (Map.Entry<String, Observable<?>> entry : mObservables.entrySet())
            mRxBridge.unregister(entry.getKey(), entry.getValue());
    }

    public void post(Object tag, Object nextObj) {
        mRxBridge.post(tag, nextObj);
    }
}
