package com.wolf.ximalaya.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseActivity;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.bean.TabBtn;
import com.wolf.ximalaya.constant.Json;
import com.wolf.ximalaya.databinding.ActivityMainBinding;
import com.wolf.ximalaya.presenter.PresentClick;
import com.wolf.ximalaya.utils.PlayButtonManager;
import com.wolf.ximalaya.viewmodel.TabViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {
    private List<BaseFragment> fragments;
    private List<TabViewModel> tabViewModels = new ArrayList<>();
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private BaseFragment currentFragment;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView.setPresenter(click);
        List<TabBtn> list = Json.getBottom();
        fragments = Json.getBaseFragments();
        for (int i = 0; i < list.size(); i++) {
            TabViewModel tabViewModel = new TabViewModel(list.get(i), fragments.get(i));
            tabViewModels.add(tabViewModel);
        }
        bindView.setTabViewModels(tabViewModels);
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        currentFragment = fragments.get(0);
        transaction.add(R.id.container, currentFragment).commit();

    }


    private PresentClick click = new PresentClick() {
        @Override
        public void click(List<TabViewModel> tabViewModels, TabViewModel tabViewModel) {
            for (TabViewModel viewModel : tabViewModels) {
                viewModel.setSelect(false);
            }
            tabViewModel.setSelect(true);
            transaction = manager.beginTransaction();
            if (tabViewModel.getFragment().isAdded()) {
                transaction.hide(currentFragment).show(tabViewModel.getFragment()).commit();
            } else {
                transaction
                        .hide(currentFragment)
                        .add(R.id.container, tabViewModel.getFragment())
                        .show(tabViewModel.getFragment()).commit();
            }
            currentFragment = tabViewModel.getFragment();

        }
    };
    @Override
    protected void onResume() {
        super.onResume();
        PlayButtonManager.getIns(this).add();
    }

    @Override
    protected void onDestroy() {
        PlayButtonManager.getIns(this).remove();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        PlayButtonManager.getIns(this).remove();
        super.onBackPressed();
    }
}
