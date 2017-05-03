package com.wolf.ximalaya;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class App extends Application {
    private static Gson gson;
    private static Context ins;

    @Override
    public void onCreate() {
        super.onCreate();
        gson = new Gson();
        ins = getApplicationContext();
    }

    public static Context getIns() {
        return ins;
    }

    public static Gson getGson() {
        return gson;
    }

    public static Object getObject(String json, Type type) {
        return gson.fromJson(json, type);
    }

    public static List getList(String json, Type type) {
        return gson.fromJson(json, type);
    }
}
