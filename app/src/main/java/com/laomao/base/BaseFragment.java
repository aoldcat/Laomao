package com.laomao.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laomao.tools.Tutil;

import butterknife.ButterKnife;


public abstract class BaseFragment<P extends BasePresenter, M extends BaseModel> extends Fragment {

    public P mPresenter;
    public M mModel;
    public Context mContext;

    @Override
    public void onAttach(Activity activity) {
        this.mContext = activity;
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        mPresenter = Tutil.getT(this, 0);
        mModel = Tutil.getT(this, 1);
        if(this instanceof BaseView)
            mPresenter.setViewModel(mModel,this);
        this.initView();
        return view;
    }

    public abstract int getLayoutId();

    public abstract void initView();

}
