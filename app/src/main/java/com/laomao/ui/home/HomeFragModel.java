package com.laomao.ui.home;

import com.laomao.base.RxSchedulers;
import com.laomao.beans.bussiness.weather.WeathersBean;
import com.laomao.http.HttpHelper;

import rx.Observable;

/**
 * Created by laomao on 16/10/19.
 */

public class HomeFragModel implements HomeFragContract.Model{
    @Override
    public Observable<WeathersBean> getWeather(String cityname) {
        return HttpHelper.getInstance()
                .dataService
                .getWeather("d9b31bf6e276f468290485dddbdcf4e0",cityname)
                .compose(RxSchedulers.ioMain());
    }
}
