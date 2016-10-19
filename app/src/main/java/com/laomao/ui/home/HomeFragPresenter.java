package com.laomao.ui.home;

/**
 * Created by laomao on 16/10/19.
 */

public class HomeFragPresenter extends HomeFragContract.Presenter {
    @Override
    public void getWeather(String cityname) {
//        cityname = URLEncoder.encode(cityname);
        mModel.getWeather(cityname).subscribe(weathersBean -> {
            mView.weatherResult(weathersBean.getResult());
        });
    }

    @Override
    public void onStart() {

    }
}
