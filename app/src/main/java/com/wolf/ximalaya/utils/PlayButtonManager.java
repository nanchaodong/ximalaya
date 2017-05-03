package com.wolf.ximalaya.utils;

import android.content.Context;
import android.graphics.PixelFormat;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.view.PlayButton;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class PlayButtonManager {
    public static PlayButtonManager ins;
    private Context mContext;
    private WindowManager windowManager;
    private PlayButton playButton;
    private WindowManager.LayoutParams lp;
    private boolean isAdded;


    private PlayButtonManager(Context context) {
        this.mContext = context;
        windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenWidth;
        int screenHeight;
        int playButtonDistance;
        screenWidth = windowManager.getDefaultDisplay().getWidth();
        screenHeight = windowManager.getDefaultDisplay().getHeight();
        playButtonDistance = context.getResources().getDimensionPixelOffset(R.dimen.d30);
        int startX = screenWidth / 2 - playButtonDistance;
        int startY = screenHeight - 2 * playButtonDistance;
        playButton = new PlayButton(context);
        lp = new WindowManager.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, playButtonDistance*2, 0, 0, PixelFormat.TRANSPARENT);
        lp.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        lp.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        lp.x = 0;
        lp.y = startY;


    }

    public static PlayButtonManager getIns(Context context) {
        if (ins == null) {
            synchronized (PlayButtonManager.class) {
                if (ins == null) {
                    ins = new PlayButtonManager(context);
                }
            }
        }
        return ins;
    }

    public void remove() {
        if (isAdded){
            windowManager.removeView(playButton);
            playButton.stop();
        }
        isAdded =false;


    }

    public void add() {
        if (!isAdded){
            windowManager.addView(playButton, lp);
            playButton.start();
            isAdded = true;
        }




    }

}
