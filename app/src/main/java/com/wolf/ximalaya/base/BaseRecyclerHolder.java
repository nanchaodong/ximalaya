package com.wolf.ximalaya.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public abstract class BaseRecyclerHolder<T, SV extends ViewDataBinding> extends RecyclerView.ViewHolder {
    protected SV bindView;
    protected BaseRecyclerAdapter mAdapter;
    protected Context mCtx;
    public BaseRecyclerHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView);
        bindView = DataBindingUtil.bind(itemView);
        mAdapter = adapter;
        mCtx = itemView.getContext();
        bindView.executePendingBindings();
    }
    public abstract void setUp(T model,int position);
}
