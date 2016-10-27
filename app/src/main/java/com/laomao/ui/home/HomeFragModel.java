package com.laomao.ui.home;

import com.laomao.base.RxSchedulers;
import com.laomao.beans.bussiness.blog.BlogBean;
import com.laomao.http.HttpHelper;

import rx.Observable;

/**
 * Created by laomao on 16/10/19.
 */

public class HomeFragModel implements HomeFragContract.Model{
    @Override
    public Observable<BlogBean> getBlogs() {
        return HttpHelper.getInstance()
                .dataService
                .getBlogs()
                .compose(RxSchedulers.ioMain());
    }
}
