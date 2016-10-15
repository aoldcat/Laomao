package com.laomao.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;

/**
 * Created by laomao on 16/9/28.
 */

public class RxBridge {
    private static RxBridge instance;
    private ConcurrentHashMap<Object, List<Subject>> subjectMap = new ConcurrentHashMap<Object, List<Subject>>();

    public static synchronized RxBridge getInstance() {
        if (null == instance)
            instance = new RxBridge();
        return instance;
    }

    /**
     * 注册监听
     */
    public <O> Observable<O> register(Object tag) {
        List<Subject> subjectList = subjectMap.get(tag);
        if (null == subjectList) {
            subjectList = new ArrayList<Subject>();
            subjectMap.put(tag, subjectList);
        }
        Subject<O, O> subjuct = PublishSubject.create();
        subjectList.add(subjuct);
        return subjuct;
    }

    /**
     * 取消监听
     */
    public RxBridge unregister(Object tag) {
        return unregister(tag, null);
    }

    public RxBridge unregister(Object tag, Observable<?> observable) {
        if (null == observable)
            subjectMap.remove(tag);
        List<Subject> subjectList = subjectMap.get(tag);
        if (subjectList != null) {
            subjectList.remove(observable);
            if (null == subjectList || subjectList.isEmpty())
                subjectMap.remove(tag);
        }
        return getInstance();
    }

    /**
     * 订阅事件
     */
    public RxBridge On(Observable<?> observable, Action1 action1) {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(action1, (e) -> e.printStackTrace());
        return getInstance();
    }

    /**
     * 事件分发
     */
    public void post(Object tag, Object nextObj) {
        List<Subject> subjectList = subjectMap.get(tag);
        if (null != subjectList && (!subjectList.isEmpty())) {
            for (Subject s : subjectList)
                s.onNext(nextObj);
        }
    }
}
