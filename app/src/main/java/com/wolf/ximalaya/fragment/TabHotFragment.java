package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.databinding.FTabSaleBinding;
import com.wolf.ximalaya.presenter.NetResponseListener;
import com.wolf.ximalaya.viewmodel.TabHotViewModel;
import com.wolf.ximalaya.viewmodel.TabSaleViewModel;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabHotFragment extends BaseFragment<FTabSaleBinding> implements NetResponseListener {
    private TabHotViewModel tabHotViewModel;

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
        tabHotViewModel = new TabHotViewModel(getActivity(), bindView.recyclerView, 1, new BaseRecyclerAdapter(getActivity()));
        tabHotViewModel.setResponseListener(this);
        tabHotViewModel.loadTop();
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
