package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.databinding.FTabAnchorBinding;
import com.wolf.ximalaya.presenter.NetResponseListener;
import com.wolf.ximalaya.viewmodel.TabAnchorViewModel;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabAnchorFragment extends BaseFragment<FTabAnchorBinding> implements NetResponseListener {
    private TabAnchorViewModel tabAnchorViewModel;


    @Override

    protected int setLayoutResID() {
        return R.layout.f_tab_anchor;
    }

    @Override
    protected void setBelow() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hideTop();
        showLoad();
        tabAnchorViewModel = new TabAnchorViewModel(getActivity(), bindView.swipe, bindView.recyclerView, 1, new BaseRecyclerAdapter(getActivity()));
        tabAnchorViewModel.setResponseListener(this);
        tabAnchorViewModel.loadTop();
    }

    @Override
    public void success() {
        showSuccess();
    }

    @Override
    public void fail(Throwable throwable) {
        showError(throwable.getMessage());
    }
}
