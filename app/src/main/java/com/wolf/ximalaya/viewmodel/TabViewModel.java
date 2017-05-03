package com.wolf.ximalaya.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wolf.ximalaya.BR;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.bean.TabBtn;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class TabViewModel extends BaseObservable{
    private TabBtn tabBtn;
    private BaseFragment fragment;

    public TabViewModel(TabBtn tabBtn, BaseFragment fragment) {
        this.tabBtn = tabBtn;
        this.fragment = fragment;
    }
    public String getImageNomal() {
        return tabBtn.getImageNomal();
    }
    public String getImageSelected() {
        return tabBtn.getImageSelected();
    }
    public String getTabName() {
        return tabBtn.getTabName();
    }
    public boolean isSelected() {
        return tabBtn.isSelected();
    }

    public void setSelect(boolean flag){
        tabBtn.setSelected(flag);
        notifyPropertyChanged(BR.tabBtn);
    }

    public BaseFragment getFragment() {
        return fragment;
    }

    @Bindable
    public TabBtn getTabBtn() {
        return tabBtn;
    }
}
