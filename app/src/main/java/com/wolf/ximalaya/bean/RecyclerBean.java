package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class RecyclerBean<T extends PresentImpl> implements PresentImpl {
    private List<T> list;

    public RecyclerBean(List<T> list) {
        this.list = list;
    }

    public RecyclerBean() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    public T getT(){
       return this.list.get(0);
    }

    @Override
    public String toString() {
        return "RecyclerBean{" +
                "list=" + list +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
