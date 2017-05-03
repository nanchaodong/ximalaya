package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.databinding.FTabRecommendBinding;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabRecommedFragment extends BaseFragment<FTabRecommendBinding> {
    @Override
    protected int setLayoutResID() {
        return R.layout.f_tab_recommend;
    }

    @Override
    protected void setBelow() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hideTop();

    }
}
