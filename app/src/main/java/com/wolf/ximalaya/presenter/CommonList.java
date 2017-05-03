package com.wolf.ximalaya.presenter;

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.presenter.multiple.PresentImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public  class CommonList {
    protected RecyclerView recyclerView;
    protected GridLayoutManager manager;
    protected Context context;
    protected BaseRecyclerAdapter mAdapter;

    public CommonList(Context context, RecyclerView recyclerView, int spanCount, BaseRecyclerAdapter adapter) {
        this.recyclerView = recyclerView;
        this.context = context;
        manager = new GridLayoutManager(context, spanCount);
        mAdapter = adapter;
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    public <T extends PresentImpl> void showRecycler(List<T> list) {
        mAdapter.add(list);
    }

    public <T extends PresentImpl> void showBean(T t) {
        mAdapter.addBean(t);
    }

    public <T extends PresentImpl> void showContinueRecycler(List<T> list) {
        mAdapter.addLoadData(list);
    }
    public <T extends PresentImpl> void showRefreshBean(T t) {
        mAdapter.addRefreshBean(t);
    }
    public void clearRecycler(){
        mAdapter.clear();
    }

    public void loadTop(){

    }
    private NetResponseListener responseListener;

    public void setResponseListener(NetResponseListener responseListener) {
        this.responseListener = responseListener;
    }
    protected void error(Throwable e) {

        if (responseListener != null) {
            responseListener.fail(e);
        }
    }



    protected void success() {
        if (responseListener != null) {
            responseListener.success();
        }
    }

}
