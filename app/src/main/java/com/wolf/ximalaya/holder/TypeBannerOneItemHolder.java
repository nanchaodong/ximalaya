package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.databinding.TypeBannerOneItemBinding;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class TypeBannerOneItemHolder extends BaseRecyclerHolder<TypeBean,TypeBannerOneItemBinding> {
    public TypeBannerOneItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(TypeBean model, int position) {
        bindView.setTypeBean(model);
    }
}
