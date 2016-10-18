package com.laomao.ui.sorts.joke;

import com.laomao.base.RxSchedulers;
import com.laomao.beans.bussiness.joke.JokeBean;
import com.laomao.http.HttpHelper;

import rx.Observable;

/**
 * Created by laomao on 16/10/11.
 */

public class JokeModel implements JokeContract.Model {
    @Override
    public Observable<JokeBean> getJokes(String key, int page, int pagesize) {
        return HttpHelper.getInstance().dataService
                .getJoke(key,page,pagesize)
                .compose(RxSchedulers.ioMain());
    }

}
