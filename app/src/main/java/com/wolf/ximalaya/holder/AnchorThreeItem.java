package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.AnchorArticle;
import com.wolf.ximalaya.databinding.AnchorThreeItemBinding;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class AnchorThreeItem extends BaseRecyclerHolder<AnchorArticle, AnchorThreeItemBinding> {
    public AnchorThreeItem(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(AnchorArticle model, int position) {
        bindView.setAnchorArticle(model);

    }
}
