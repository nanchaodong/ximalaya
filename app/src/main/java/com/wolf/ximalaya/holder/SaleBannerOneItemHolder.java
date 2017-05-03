package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.FocusImage;
import com.wolf.ximalaya.databinding.SaleBannerOneItemBinding;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleBannerOneItemHolder extends BaseRecyclerHolder<FocusImage, SaleBannerOneItemBinding> {
    public SaleBannerOneItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(FocusImage model, int position) {
        bindView.setFocusPicture(model.getList().get(position));

    }
}
