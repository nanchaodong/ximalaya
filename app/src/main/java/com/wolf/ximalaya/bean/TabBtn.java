package com.wolf.ximalaya.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wolf.ximalaya.BR;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class TabBtn extends BaseObservable {
    private String imageNomal;
    private String imageSelected;
    private String tabName;
    private boolean isSelected;
    private int index;

    public TabBtn(String imageNomal, String imageSelected, String tabName, boolean isSelected, int index) {
        this.imageNomal = imageNomal;
        this.imageSelected = imageSelected;
        this.tabName = tabName;
        this.isSelected = isSelected;
        this.index = index;
    }

    public TabBtn() {
    }

    public String getImageNomal() {
        return imageNomal;
    }

    public void setImageNomal(String imageNomal) {
        this.imageNomal = imageNomal;
    }

    public String getImageSelected() {
        return imageSelected;
    }

    public void setImageSelected(String imageSelected) {
        this.imageSelected = imageSelected;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @Bindable
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
        notifyPropertyChanged(BR.selected);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "TabBtn{" +
                "imageNomal='" + imageNomal + '\'' +
                ", imageSelected='" + imageSelected + '\'' +
                ", tabName='" + tabName + '\'' +
                ", isSelected=" + isSelected +
                ", index=" + index +
                '}';
    }
}
