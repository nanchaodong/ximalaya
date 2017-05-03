package com.wolf.ximalaya.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wolf.ximalaya.bean.TabEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {
    private List<TabEntity> datas;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        datas = new ArrayList<>();
    }

    public void add(List<TabEntity> list) {
        this.datas = list;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return datas.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return datas.get(position).getTitle();
    }
}
