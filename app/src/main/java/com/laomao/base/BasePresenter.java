package com.laomao.base;

import android.content.Context;

/**
 * Created by laomao on 16/9/10.
 */
public abstract class BasePresenter<M, V> {
    public Context mContext;
    public M mModel;
    public V mView;
    public RxManager mRxManager = new RxManager();

    public abstract void onStart();

    public void setViewModel(M m, V v) {
        this.mModel = m;
        this.mView = v;
        this.onStart();
    }

    public void destory() {
        this.mRxManager.remove();
    }
}
