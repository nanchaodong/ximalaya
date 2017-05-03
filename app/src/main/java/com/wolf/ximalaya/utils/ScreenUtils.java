package com.wolf.ximalaya.utils;

import android.content.Context;
import android.view.WindowManager;

import com.wolf.ximalaya.App;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class ScreenUtils {
    public static int getScreenHeight() {
        WindowManager manager = (WindowManager) App.getIns().getSystemService(Context.WINDOW_SERVICE);
        return manager.getDefaultDisplay().getHeight();
    }

    public static int getScreenWidth() {
        WindowManager manager = (WindowManager) App.getIns().getSystemService(Context.WINDOW_SERVICE);
        return manager.getDefaultDisplay().getWidth();
    }
    public static int dpToPx(int dip){
        return App.getIns().getResources().getDimensionPixelSize(dip);
    }
}
