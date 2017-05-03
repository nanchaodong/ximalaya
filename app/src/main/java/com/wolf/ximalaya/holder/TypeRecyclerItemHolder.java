package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.RecyclerBean;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.databinding.TypeRecyclerItemBinding;
import com.wolf.ximalaya.presenter.CommonList;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class TypeRecyclerItemHolder extends BaseRecyclerHolder<RecyclerBean, TypeRecyclerItemBinding> {
    private CommonList commonList;

    public TypeRecyclerItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(RecyclerBean model, int position) {
        bindView.recyclerView.setNestedScrollingEnabled(false);
        if (model.getT() instanceof TypeBean) {
            commonList = new CommonList(mCtx, bindView.recyclerView, 2, new BaseRecyclerAdapter(mCtx));
            commonList.showRecycler(model.getList());
        }
    }

}
