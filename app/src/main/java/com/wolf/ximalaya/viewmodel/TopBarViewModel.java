package com.wolf.ximalaya.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wolf.ximalaya.BR;
import com.wolf.ximalaya.bean.TopBar;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class TopBarViewModel extends BaseObservable {
    private TopBar topBar;
    private boolean showTop = true;
    private boolean showInput;
    private boolean isNomal = true;

    public TopBarViewModel(TopBar topBar) {
        this.topBar = topBar;
    }

    public TopBar getTopBar() {
        return topBar;
    }

    @Bindable
    public int getLeftImage() {
        return topBar.getLeftImage();
    }


    public void setLeftImage(int id) {
        topBar.setLeftImage(id);
        notifyPropertyChanged(BR.leftImage);

    }

    @Bindable
    public String getLeftText() {
        return topBar.getLeftText();
    }

    public void setLeftText(String text) {
        topBar.setLeftText(text);
        notifyPropertyChanged(BR.leftText);

    }

    @Bindable
    public boolean isShowTop() {
        return showTop;
    }

    public void setShowTop(boolean showTop) {
        this.showTop = showTop;
        notifyPropertyChanged(BR.showTop);
    }

    @Bindable
    public boolean isNomal() {
        return isNomal;
    }

    public void setNomal(boolean nomal) {
        isNomal = nomal;
        notifyPropertyChanged(BR.nomal);
    }

    @Bindable
    public String getTitle() {
        return topBar.getTitle();
    }

    public void setTitle(String title) {
        topBar.setTitle(title);
        setShowInput(false);
        notifyPropertyChanged(BR.title);

    }

    @Bindable
    public boolean isShowInput() {
        return showInput;
    }

    public void setShowInput(boolean showInput) {
        this.showInput = showInput;
        notifyPropertyChanged(BR.showInput);
    }

    @Bindable
    public int getRightImage() {
        return topBar.getRightImage();
    }

    public void setRightImage(int id) {
        topBar.setRightImage(id);
        notifyPropertyChanged(BR.rightImage);
    }

    @Bindable
    public String getRightText() {
        return topBar.getRightText();
    }

    public void setRightText(String text) {
        topBar.setRightText(text);
        notifyPropertyChanged(BR.rightText);

    }

    @Bindable
    public int getRightTwoImage() {
        return topBar.getRightTwoImage();
    }

    @Bindable
    public String getRightTwoText() {
        return topBar.getRightTwoText();
    }

    public void setRightTwoText(String text) {
        topBar.setRightTwoText(text);
        notifyPropertyChanged(BR.rightTwoText);
    }

    public void setRightTwoImage(int id) {
        topBar.setRightTwoImage(id);
        notifyPropertyChanged(BR.rightTwoImage);
    }
}
