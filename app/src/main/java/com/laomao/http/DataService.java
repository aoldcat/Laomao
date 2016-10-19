package com.laomao.http;

import com.laomao.beans.bussiness.joke.JokeBean;
import com.laomao.beans.bussiness.weather.WeathersBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by laomao on 16/10/10.
 */

public interface DataService {

    @GET("text.from")
    Observable<JokeBean> getJoke(@Query("key") String key,@Query("page") int page,@Query("pagesize") int pagesize);

    @GET("weather/query")
    Observable<WeathersBean> getWeather(@Query("key") String key,@Query("cityname") String cityname);
}
