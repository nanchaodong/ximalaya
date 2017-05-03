package com.wolf.ximalaya.base;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.service.voice.VoiceInteractionService;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.bean.PageAnim;
import com.wolf.ximalaya.bean.TopBar;
import com.wolf.ximalaya.databinding.FBaseBinding;
import com.wolf.ximalaya.presenter.TopClick;
import com.wolf.ximalaya.utils.ViewUtils;
import com.wolf.ximalaya.viewmodel.TopBarViewModel;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public abstract class BaseFragment<SV extends ViewDataBinding> extends Fragment {
    protected FBaseBinding fBaseBinding;
    protected SV bindView;
    private FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    protected TopBarViewModel topBarViewModel;
    protected PageAnim pageAnim;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fBaseBinding = DataBindingUtil.inflate(inflater, R.layout.f_base, null, false);
        bindView = DataBindingUtil.inflate(inflater, setLayoutResID(), null, false);
        fBaseBinding.contentContainer.addView(bindView.getRoot(), layoutParams);
        setBelow();
        topBarViewModel = new TopBarViewModel(new TopBar());
        pageAnim = new PageAnim();
        fBaseBinding.setPageAnim(pageAnim);
        fBaseBinding.setTopBarViewModel(topBarViewModel);
        return fBaseBinding.getRoot();
    }

    protected void setBelow() {
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) fBaseBinding.body.getLayoutParams();
        lp.addRule(RelativeLayout.BELOW, R.id.top);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fBaseBinding.top.setListener(new TopClick() {
            @Override
            public void clickLeft() {
                super.clickLeft();
                ViewUtils.showToast("left");
            }

            @Override
            public void clickInput() {
                super.clickInput();
                ViewUtils.showToast("input");

            }

            @Override
            public void clickRight() {
                super.clickRight();
                ViewUtils.showToast("right");

            }

            @Override
            public void clickRightTwo() {
                super.clickRightTwo();
                ViewUtils.showToast("righttwo");

            }
        });
    }

    protected abstract int setLayoutResID();

    protected void setLeftImage(int imageId) {
        topBarViewModel.setLeftImage(imageId);
    }

    protected void setRightImage(int imageId) {
        topBarViewModel.setRightImage(imageId);
    }

    protected void setRightTwoImage(int imageId) {
        topBarViewModel.setRightTwoImage(imageId);
    }

    protected void setLeftText(Object o) {
        String text = null;
        if (o instanceof String) {
            text = (String) o;
        } else if (o instanceof Integer) {
            text = getString((Integer) o);
        }
        topBarViewModel.setLeftText(text);

    }

    protected void hideTop() {
        topBarViewModel.setShowTop(false);

    }

    protected void showTitle(Object o) {
        String title = null;
        if (o instanceof String) {
            title = (String) o;
        } else if (o instanceof Integer) {
            title = getString((Integer) o);
        }
        topBarViewModel.setTitle(title);

    }


    protected void showTopInput() {
        topBarViewModel.setShowInput(true);
    }

    protected void showUnNomalBg() {
        topBarViewModel.setNomal(false);

    }

    protected void showRightText(Object o) {
        String text = null;
        if (o instanceof String) {
            text = (String) o;
        } else if (o instanceof Integer) {
            text = getString((Integer) o);
        }
        topBarViewModel.setRightText(text);

    }

    protected void showRightTwoText(Object o) {
        String text = null;
        if (o instanceof String) {
            text = (String) o;
        } else if (o instanceof Integer) {
            text = getString((Integer) o);
        }
        topBarViewModel.setRightTwoText(text);
    }

    protected void setComminTop() {
        setLeftImage(R.mipmap.icon_top_message);
        setLeftText(R.string.tab_main_top_left);
        setRightTwoImage(R.mipmap.icon_top_history);
        setRightImage(R.mipmap.icon_top_download);
        showRightText(R.string.tab_main_top_right);
        showRightTwoText(R.string.tab_main_top_right_two);
    }
    protected void showLoad(){
        pageAnim.setNomal();
    }
    protected void showSuccess(){
        pageAnim.setSuccess();
    }
    protected void showError(String msg){
        pageAnim.setError(msg);
    }

}
