package com.laomao.ui.home;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by laomao on 16/10/19.
 */

public class HomeFragPresenter extends HomeFragContract.Presenter {
    @Override
    public void getWeather(String cityname) {
//        cityname = URLEncoder.encode(cityname);
        mModel.getWeather(cityname).observeOn(AndroidSchedulers.mainThread())
                .subscribe(weathersBean -> {
                    mView.weatherResult(weathersBean.getResult());
                });
    }

    @Override
    public void onStart() {

    }
}
