package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.AnchorArticle;
import com.wolf.ximalaya.databinding.AnchorOneItemBinding;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class AnchorOneItem extends BaseRecyclerHolder<AnchorArticle, AnchorOneItemBinding> {
    public AnchorOneItem(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(AnchorArticle model, int position) {
        bindView.setAnchorArticle(model);
        bindView.setPosition(position);
    }
}
