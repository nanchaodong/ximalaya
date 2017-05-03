package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.UserHeaderItem;
import com.wolf.ximalaya.databinding.UserHeaderItemBinding;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class UserHeadItemHolder extends BaseRecyclerHolder<UserHeaderItem, UserHeaderItemBinding> {
    public UserHeadItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(UserHeaderItem model, int position) {
        bindView.setUserHead(model);

    }
}
