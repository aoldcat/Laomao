package com.laomao.base;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by laomao on 16/10/9.
 */

public class RxSchedulers {
    public static <T> Observable.Transformer<T, T> ioMain() {
        return tObservable -> tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
