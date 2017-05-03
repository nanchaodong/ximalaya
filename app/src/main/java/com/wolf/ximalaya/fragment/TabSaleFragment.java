package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.bean.TabBtn;
import com.wolf.ximalaya.databinding.FTabAnchorBinding;
import com.wolf.ximalaya.databinding.FTabSaleBinding;
import com.wolf.ximalaya.presenter.NetResponseListener;
import com.wolf.ximalaya.viewmodel.TabAnchorViewModel;
import com.wolf.ximalaya.viewmodel.TabSaleViewModel;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabSaleFragment extends BaseFragment<FTabSaleBinding> implements NetResponseListener {
    private TabSaleViewModel tabSaleViewModel;

    @Override

    protected int setLayoutResID() {
        return R.layout.f_tab_sale;
    }

    @Override
    protected void setBelow() {
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hideTop();
        showLoad();
        tabSaleViewModel = new TabSaleViewModel(getActivity(), bindView.recyclerView, 1, new BaseRecyclerAdapter(getActivity()));
        tabSaleViewModel.setResponseListener(this);
        tabSaleViewModel.loadTop();
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
