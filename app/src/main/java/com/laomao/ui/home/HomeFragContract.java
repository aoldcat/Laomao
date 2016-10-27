package com.laomao.ui.home;

import com.laomao.base.BaseModel;
import com.laomao.base.BasePresenter;
import com.laomao.base.BaseView;
import com.laomao.beans.bussiness.blog.BlogBean;
import com.laomao.beans.bussiness.weather.WeathersBean;

import rx.Observable;

/**
 * Created by laomao on 16/10/18.
 */

public interface HomeFragContract {
    interface Model extends BaseModel
    {
        Observable<BlogBean> getBlogs();
    }
    interface View extends BaseView
    {
        void blogResult(BlogBean blogBean);
    }
    abstract class Presenter extends BasePresenter<Model,View>
    {
        public abstract void getBlogs();
    }
}
