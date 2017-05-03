package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.base.BaseFragment;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabEntity {
    private String title;
    private BaseFragment fragment;

    public TabEntity(String title, BaseFragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public TabEntity() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BaseFragment getFragment() {
        return fragment;
    }

    public void setFragment(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public String toString() {
        return "TabEntity{" +
                "title='" + title + '\'' +
                ", fragment=" + fragment +
                '}';
    }
}
