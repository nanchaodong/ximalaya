package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.databinding.FFindBinding;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class FindFragment extends BaseFragment<FFindBinding> {
    @Override
    protected int setLayoutResID() {
        return R.layout.f_find;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showTitle(R.string.tab_find_title);
        setComminTop();
    }
}
