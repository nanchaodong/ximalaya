package com.wolf.ximalaya.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wolf.ximalaya.BR;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class PageAnim extends BaseObservable {
    private boolean showAnim;
    private boolean showProcess = true;
    private String text = "正在加载中...";

    public PageAnim(boolean showAnim, boolean showProcess, String text) {
        this.showAnim = showAnim;
        this.showProcess = showProcess;
        this.text = text;
    }

    public PageAnim() {
    }

    @Bindable
    public boolean isShowAnim() {
        return showAnim;
    }

    public void setShowAnim(boolean showAnim) {
        this.showAnim = showAnim;
        notifyPropertyChanged(BR.showAnim);
    }

    @Bindable
    public boolean isShowProcess() {
        return showProcess;
    }

    public void setShowProcess(boolean showProcess) {
        this.showProcess = showProcess;
        notifyPropertyChanged(BR.showProcess);

    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        showProcess = false;
        notifyPropertyChanged(BR.text);

    }

    public void setNomal() {
        showAnim = true;
        showProcess = true;
        text = "正在加载中...";
        notifyPropertyChanged(BR.showAnim);
        notifyPropertyChanged(BR.showProcess);
        notifyPropertyChanged(BR.text);
    }
    public void setSuccess(){
        showAnim = false;
        showProcess = true;
        text = "正在加载中...";
        notifyPropertyChanged(BR.showAnim);
        notifyPropertyChanged(BR.showProcess);
        notifyPropertyChanged(BR.text);

    }
    public void setError(String msg){
        showAnim = true;
        showProcess = false;
        text = msg;
        notifyPropertyChanged(BR.showAnim);
        notifyPropertyChanged(BR.showProcess);
        notifyPropertyChanged(BR.text);

    }
}
