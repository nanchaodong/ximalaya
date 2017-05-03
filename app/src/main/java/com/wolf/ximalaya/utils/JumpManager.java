package com.wolf.ximalaya.utils;

import android.content.Context;
import android.content.Intent;

import com.wolf.ximalaya.activity.RecordActivity;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class JumpManager {
    public static void showRecord(Context context) {
        Intent intent = new Intent(context, RecordActivity.class);
        context.startActivity(intent);
    }
}
