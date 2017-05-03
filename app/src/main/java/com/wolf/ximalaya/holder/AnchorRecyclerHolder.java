package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.AnchorDetail;
import com.wolf.ximalaya.databinding.AnchorRecyclerLayoutBinding;
import com.wolf.ximalaya.presenter.CommonList;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class AnchorRecyclerHolder extends BaseRecyclerHolder<AnchorDetail, AnchorRecyclerLayoutBinding> {
    private CommonList commonList;

    public AnchorRecyclerHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(AnchorDetail model, int position) {
        bindView.setAnchorDetail(model);
        bindView.recyclerView.setNestedScrollingEnabled(false);
        switch (model.getDisplayStyle()) {
            case 2:
                commonList = new CommonList(mCtx, bindView.recyclerView, 1, new BaseRecyclerAdapter(mCtx));
                break;
            default:
                commonList = new CommonList(mCtx, bindView.recyclerView, 3, new BaseRecyclerAdapter(mCtx));
                break;
        }
        commonList.showRecycler(model.getList());
    }
}
