package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.adapter.TabPagerAdapter;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.bean.TabEntity;
import com.wolf.ximalaya.bean.TopBar;
import com.wolf.ximalaya.constant.Json;
import com.wolf.ximalaya.databinding.FMainBinding;
import com.wolf.ximalaya.presenter.TopClick;
import com.wolf.ximalaya.utils.ViewUtils;

import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class MainFragment extends BaseFragment<FMainBinding> {
    private List<TabEntity> fragments = Json.getTabs();
    private TabPagerAdapter adapter;

    @Override
    protected int setLayoutResID() {
        return R.layout.f_main;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setComminTop();
        showTopInput();
        showUnNomalBg();
        adapter = new TabPagerAdapter(getChildFragmentManager());
        bindView.viewpager.setAdapter(adapter);
        bindView.viewpager.setOffscreenPageLimit(5);
        adapter.add(fragments);
        bindView.tablayout.setupWithViewPager(bindView.viewpager);

    }
}
