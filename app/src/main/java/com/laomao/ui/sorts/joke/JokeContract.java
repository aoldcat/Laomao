package com.laomao.ui.sorts.joke;

import com.laomao.base.BaseModel;
import com.laomao.base.BasePresenter;
import com.laomao.base.BaseView;
import com.laomao.beans.bussiness.joke.JokeBean;

import java.util.List;

import rx.Observable;

/**
 * Created by laomao on 16/10/11.
 */

public interface JokeContract {
    interface Model extends BaseModel {
        Observable<JokeBean> getJokes(String key, int page, int pagesize);
    }

    interface View extends BaseView {
        void getJokes(List<JokeBean.ResultBean.DataBean> jokeList);
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        public abstract void getJokes(int page, int pagesize);
    }

}
