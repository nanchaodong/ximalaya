package com.wolf.ximalaya.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseActivity;
import com.wolf.ximalaya.databinding.ARecordBinding;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class RecordActivity extends BaseActivity<ARecordBinding>{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_record);
    }


}
