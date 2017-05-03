package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.SaleList;
import com.wolf.ximalaya.databinding.SaleListItemBinding;
import com.wolf.ximalaya.presenter.CommonList;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleListItemHolder extends BaseRecyclerHolder<SaleList, SaleListItemBinding> {
    private CommonList commonList;

    public SaleListItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(SaleList model, int position) {
        bindView.setSaleList(model);
        bindView.recyclerView.setNestedScrollingEnabled(false);
        commonList = new CommonList(mCtx, bindView.recyclerView, 1, new BaseRecyclerAdapter(mCtx));
        commonList.showRecycler(model.getList());
    }

}
