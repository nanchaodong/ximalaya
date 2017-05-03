package com.wolf.ximalaya.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.databinding.ABaseBinding;
import com.wolf.ximalaya.utils.PlayButtonManager;
import com.wolf.ximalaya.utils.ScreenUtils;
import com.wolf.ximalaya.utils.ViewUtils;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class BaseActivity<SV extends ViewDataBinding> extends AppCompatActivity implements View.OnLayoutChangeListener {
    private static final String TAG = "BaseActivity";
    protected ABaseBinding aBaseBinding;
    protected SV bindView;
    protected LayoutInflater mInflater;
    private FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    private KeyReceiver receiver;
    private int keyHeight = ScreenUtils.getScreenHeight() / 3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        receiver = new KeyReceiver();
        IntentFilter homeFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        registerReceiver(receiver, homeFilter);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        mInflater = getLayoutInflater();
        aBaseBinding = DataBindingUtil.inflate(mInflater, R.layout.a_base, null, false);
        bindView = DataBindingUtil.inflate(mInflater, layoutResID, null, false);
        aBaseBinding.contentContainer.addView(bindView.getRoot(), layoutParams);
        aBaseBinding.rootContainer.addOnLayoutChangeListener(this);
        getWindow().setContentView(aBaseBinding.getRoot());

    }

    @Override
    public void onLayoutChange(View view, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        Log.i(TAG, "onLayoutChange: " + "i " + i + "  i1 " + i1 + "  i2 " + i2 + "  i3 " + i3 + "  i4 " + i4 + "  i5 " + i5 + "  i6 " + i6 + "  i7 " + i7);
        if (i3 != 0 && i7 != 0 && (i7 - i3) > keyHeight) {
            PlayButtonManager.getIns(this).remove();
        } else if (i3 != 0 && i7 != 0 && (i3 - i7) > keyHeight) {
            aBaseBinding.contentContainer.postDelayed(new Runnable() {
                @Override
                public void run() {
                    PlayButtonManager.getIns(BaseActivity.this).add();

                }
            }, 200);

        }
    }


    private class KeyReceiver extends BroadcastReceiver {
        private final String SYSTEM_DIALOG_REASON_KEY = "reason";
        private final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        private final String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";


        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
                String reason = intent.getStringExtra(SYSTEM_DIALOG_REASON_KEY);

                if (reason == null) {
                    return;

                }


                // Home键
                if (reason.equals(SYSTEM_DIALOG_REASON_HOME_KEY)) {
                    PlayButtonManager.getIns(context).remove();
                }

                // 最近任务列表键
                if (reason.equals(SYSTEM_DIALOG_REASON_RECENT_APPS)) {
                    PlayButtonManager.getIns(context).remove();

                }
            }
        }

    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }
}
