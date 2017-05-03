package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.databinding.TypeButtonItemBinding;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class TypeButtonItemHolder extends BaseRecyclerHolder<TypeBean,TypeButtonItemBinding> {
    public TypeButtonItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(TypeBean model, int position) {
        bindView.setTypeBean(model);
        bindView.setPosition(position);

    }
}
