package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.databinding.FReadBinding;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class ReadFragment extends BaseFragment<FReadBinding> {
    @Override
    protected int setLayoutResID() {
        return R.layout.f_read;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showTitle(R.string.tab_read_title);
        setComminTop();
    }
}
