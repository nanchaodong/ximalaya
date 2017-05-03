package com.wolf.ximalaya.utils;

import android.widget.Toast;

import com.wolf.ximalaya.App;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class ViewUtils {
    public static void showToast(int mes) {
        Toast.makeText(App.getIns(), mes, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(String mes) {
        Toast.makeText(App.getIns(), mes, Toast.LENGTH_SHORT).show();
    }
}
