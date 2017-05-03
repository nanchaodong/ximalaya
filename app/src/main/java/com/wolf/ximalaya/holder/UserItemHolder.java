package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.UserItem;
import com.wolf.ximalaya.databinding.UserItemBinding;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class UserItemHolder extends BaseRecyclerHolder<UserItem, UserItemBinding> {
    public UserItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(UserItem model, int position) {
        bindView.setUserItem(model);

    }
}
