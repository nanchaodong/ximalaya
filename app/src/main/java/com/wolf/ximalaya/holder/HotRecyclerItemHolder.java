package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.databinding.HotRecyclerItemBinding;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class HotRecyclerItemHolder extends BaseRecyclerHolder<HotList,HotRecyclerItemBinding> {
    public HotRecyclerItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(HotList model, int position) {

    }
}
