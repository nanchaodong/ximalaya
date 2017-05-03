package com.wolf.ximalaya.presenter.multiple;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.AnchorArticle;
import com.wolf.ximalaya.bean.AnchorDetail;
import com.wolf.ximalaya.bean.FocusImage;
import com.wolf.ximalaya.bean.HotBean;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.bean.RecyclerBean;
import com.wolf.ximalaya.bean.SaleDetail;
import com.wolf.ximalaya.bean.SaleList;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.bean.UserHeaderItem;
import com.wolf.ximalaya.bean.UserItem;
import com.wolf.ximalaya.bean.UserMiddleItem;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public interface TypeFactoryImpl {
    int type(UserItem userItem);

    int type(UserMiddleItem userMiddleItem);

    int type(UserHeaderItem userHeaderItem);

    int type(AnchorDetail anchorDetail);

    int type(AnchorArticle anchorArticle);

    int type(SaleList saleList);

    int type(FocusImage focusImage);

    int type(SaleDetail saleDetail);

    int type(HotList hotList);

    int type(HotBean bean);

    int type(TypeBean bean);

    int type(RecyclerBean bean);

    BaseRecyclerHolder createHolder(int itemType, View ItemView, BaseRecyclerAdapter adapter);
}
