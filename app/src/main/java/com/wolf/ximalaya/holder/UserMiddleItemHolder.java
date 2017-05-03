package com.wolf.ximalaya.holder;

import android.content.Context;
import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.UserMiddleItem;
import com.wolf.ximalaya.databinding.UserMiddleItemBinding;
import com.wolf.ximalaya.presenter.PresentClick;
import com.wolf.ximalaya.utils.JumpManager;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class UserMiddleItemHolder extends BaseRecyclerHolder<UserMiddleItem, UserMiddleItemBinding> {
    public UserMiddleItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    public void setUp(UserMiddleItem model, int position) {
        bindView.setUserMiddle(model);
        bindView.setPresenter(click);

    }

    private PresentClick click = new PresentClick() {
        @Override
        public void click(int position) {
            switch (position) {
                case 0:
                    JumpManager.showRecord(mCtx);
                    break;
                case 1:
                    break;
            }
        }
    };
}
