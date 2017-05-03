package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.SaleDetail;
import com.wolf.ximalaya.databinding.SaleDetailItemBinding;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleDetailItemHolder extends BaseRecyclerHolder<SaleDetail, SaleDetailItemBinding> {

    public SaleDetailItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(SaleDetail model, int position) {
        bindView.setSaleDetail(model);

    }
}
