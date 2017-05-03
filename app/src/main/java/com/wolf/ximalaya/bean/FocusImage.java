package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class FocusImage implements PresentImpl{
    private String ret;
    private String title;
    private List<FocusPicture> list;

    public FocusImage(String ret, String title, List<FocusPicture> list) {
        this.ret = ret;
        this.title = title;
        this.list = list;
    }

    public FocusImage() {
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FocusPicture> getList() {
        return list;
    }

    public void setList(List<FocusPicture> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "FocusImage{" +
                "ret='" + ret + '\'' +
                ", title='" + title + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
