package com.wolf.ximalaya.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.databinding.FTabAnchorBinding;
import com.wolf.ximalaya.databinding.FTabSaleBinding;
import com.wolf.ximalaya.presenter.NetResponseListener;
import com.wolf.ximalaya.viewmodel.TabAnchorViewModel;
import com.wolf.ximalaya.viewmodel.TabTypeViewModel;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabTypeFragment extends BaseFragment<FTabSaleBinding> implements NetResponseListener {
    private TabTypeViewModel tabTypeViewModel;


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
        tabTypeViewModel = new TabTypeViewModel(getActivity(), bindView.recyclerView, 1, new BaseRecyclerAdapter(getActivity()));
        tabTypeViewModel.setResponseListener(this);
        tabTypeViewModel.loadTop();
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
