package com.wolf.ximalaya.bean;

import android.text.style.TtsSpan;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleList implements PresentImpl {
    private String ret;
    private String count;
    private String title;
    private List<SaleDetail> list;

    public SaleList(String ret, String count, String title, List<SaleDetail> list) {
        this.ret = ret;
        this.count = count;
        this.title = title;
        this.list = list;
    }

    public SaleList() {
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SaleDetail> getList() {
        return list;
    }

    public void setList(List<SaleDetail> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "SaleList{" +
                "ret='" + ret + '\'' +
                ", count='" + count + '\'' +
                ", title='" + title + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
