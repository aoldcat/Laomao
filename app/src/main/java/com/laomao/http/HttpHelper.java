package com.laomao.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.laomao.LaomaoApplication;
import com.laomao.tools.LogUtil;
import com.laomao.tools.NetworkUtil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by laomao on 16/10/10.
 */

public class HttpHelper {

//    public static final String LEANCLOUD_ID = "LY9qvSrv3qK6CXE2HIT4s4mj-gzGzoHsz";
//    public static final String LEANCLOUD_KEY = "vB9XsJyWk9v86Ivc3wd4lq2P";
//    public static final String BASE_URL = "https://api.leancloud.cn/1.1/";
//    public static  String BASE_URL="http://japi.juhe.cn/joke/content/";
    public static  String BASE_URL="http://op.juhe.cn/onebox/";
    public Retrofit retrofit;
    public DataService dataService;

    private HttpHelper() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);//设置查看请求报文级别
        File fileCache = new File(LaomaoApplication.getAppContext().getCacheDir(), "logcache");
        Cache cache = new Cache(fileCache, 1024 * 1024 * 50);//50M

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(45, TimeUnit.SECONDS)
                .connectTimeout(45, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .addInterceptor(commonInterceptor)
                .addNetworkInterceptor(new HttpCacheInterceptor())
                .cache(cache)
                .build();

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ssZ").serializeNulls().create();

        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        dataService = retrofit.create(DataService.class);

    }

    public HttpHelper setBaseurl(String baseurl)
    {
        this.BASE_URL=baseurl;
        return this;
    }
    private static class SingleInstance {
        private static final HttpHelper httpHelper = new HttpHelper();
    }

    //单例HttpHelper
    public static HttpHelper getInstance() {
        return SingleInstance.httpHelper;
    }

    Interceptor commonInterceptor = chain -> chain.proceed(chain.request().newBuilder()
            .addHeader("Content-Type", "application/json")
//            .addHeader("X-LC-Id", LEANCLOUD_ID)
//            .addHeader("X-LC-Key", LEANCLOUD_KEY)
            .build());

    class HttpCacheInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            if (!NetworkUtil.isNetConnected(LaomaoApplication.getAppContext())) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
                LogUtil.showLog("HttpHelper", "网络异常");
            }
            Response originalResponse = chain.proceed(request);
            if (NetworkUtil.isNetConnected(LaomaoApplication.getAppContext())) {
                String cacheControl = request.cacheControl().toString();
                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .removeHeader("Pragma")
                        .build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=2419200")
                        .removeHeader("Pragma")
                        .build();
            }
        }
    }
}
