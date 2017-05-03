package com.wolf.ximalaya.utils.http;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class RetrofitHelper {
    private static final int DEFAULT_TIMEOUT = 10;
    private Retrofit retrofit;
    private OkHttpClient.Builder builder;
    private RetrofitService service;

    private static class SingleTon {
        private static final RetrofitHelper INSTANCE = new RetrofitHelper();
    }

    public static RetrofitHelper getInstance() {
        return SingleTon.INSTANCE;
    }

    private RetrofitHelper() {
        builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("http://www.baidu.com/")
                .build();
        service = retrofit.create(RetrofitService.class);
    }
    public RetrofitService getService(){
        return service;
    }

}
