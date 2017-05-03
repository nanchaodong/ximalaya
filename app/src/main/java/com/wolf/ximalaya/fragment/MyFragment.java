package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.constant.Json;
import com.wolf.ximalaya.databinding.FMyBinding;
import com.wolf.ximalaya.presenter.CommonList;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class MyFragment extends BaseFragment<FMyBinding> {
    private CommonList commonList;

    @Override
    protected int setLayoutResID() {
        return R.layout.f_my;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hideTop();
        commonList = new CommonList(getActivity(), bindView.recyclerView, 1, new BaseRecyclerAdapter(getActivity()));
        commonList.showBean(Json.getUserHeaderItem());
        commonList.showBean(Json.getUserMiddleItem());
        commonList.showContinueRecycler(Json.getUserItem());

    }
}
