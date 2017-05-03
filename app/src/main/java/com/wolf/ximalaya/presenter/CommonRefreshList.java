package com.wolf.ximalaya.presenter;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public abstract class CommonRefreshList extends CommonList {
    protected SwipeRefreshLayout refreshLayout;

    public CommonRefreshList(Context context, SwipeRefreshLayout refreshLayout, RecyclerView recyclerView, int spanCount, BaseRecyclerAdapter adapter) {
        super(context, recyclerView, spanCount, adapter);
        this.refreshLayout = refreshLayout;
        this.refreshLayout.setOnRefreshListener(onRefreshListener);
    }

    private SwipeRefreshLayout.OnRefreshListener onRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            loadTop();
        }


    };
    protected void complete() {
        refreshLayout.setRefreshing(false);

    }
}
