package com.wolf.ximalaya.presenter.multiple;

import android.view.View;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.AnchorArticle;
import com.wolf.ximalaya.bean.AnchorDetail;
import com.wolf.ximalaya.bean.FocusImage;
import com.wolf.ximalaya.bean.FocusPicture;
import com.wolf.ximalaya.bean.HotBean;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.bean.RecyclerBean;
import com.wolf.ximalaya.bean.SaleDetail;
import com.wolf.ximalaya.bean.SaleList;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.bean.UserHeaderItem;
import com.wolf.ximalaya.bean.UserItem;
import com.wolf.ximalaya.bean.UserMiddleItem;
import com.wolf.ximalaya.databinding.ActivityMainBinding;
import com.wolf.ximalaya.holder.AnchorOneItem;
import com.wolf.ximalaya.holder.AnchorRecyclerHolder;
import com.wolf.ximalaya.holder.AnchorThreeItem;
import com.wolf.ximalaya.holder.HotBannerItemHolder;
import com.wolf.ximalaya.holder.HotRecyclerItemHolder;
import com.wolf.ximalaya.holder.HotSqureItemHolder;
import com.wolf.ximalaya.holder.SaleBannerOneItemHolder;
import com.wolf.ximalaya.holder.SaleDetailItemHolder;
import com.wolf.ximalaya.holder.SaleListItemHolder;
import com.wolf.ximalaya.holder.TypeBannerOneItemHolder;
import com.wolf.ximalaya.holder.TypeButtonItemHolder;
import com.wolf.ximalaya.holder.TypeRecyclerItemHolder;
import com.wolf.ximalaya.holder.UserHeadItemHolder;
import com.wolf.ximalaya.holder.UserItemHolder;
import com.wolf.ximalaya.holder.UserMiddleItemHolder;

import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class TypeFactoryList implements TypeFactoryImpl {
    private static final int USER_ITEM = R.layout.user_item;
    private static final int USER_MIDDLE_ITEM = R.layout.user_middle_item;
    private static final int USER_HEADER_ITEM = R.layout.user_header_item;
    private static final int ANCHOR_RECYCLER_ITEM = R.layout.anchor_recycler_layout;
    private static final int ANCHOR_THREE_ITEM = R.layout.anchor_three_item;
    private static final int ANCHOR_ONE_ITEM = R.layout.anchor_one_item;
    private static final int SALE_BANNER_ONE_ITEM = R.layout.sale_banner_one_item;
    private static final int SALE_LIST_ITEM = R.layout.sale_list_item;
    private static final int SALE_DETAIL_ITEM = R.layout.sale_detail_item;
    private static final int HOT_BANNER_ITEM = R.layout.hot_banner_item;
    private static final int COMMON_RECYCLER_ITEM = R.layout.common_recycler_item;
    private static final int HOT_RECYCLER_ITEM = R.layout.hot_recycler_item;
    private static final int TYPE_BANNER_ONE__ITEM = R.layout.type_banner_one_item;
    private static final int TYPE_RECYCLER_ITEM = R.layout.type_recycler_item;
    private static final int TYPE_BUTTON_ITEM = R.layout.type_button_item;

    @Override
    public int type(UserItem userItem) {
        return USER_ITEM;
    }

    @Override
    public int type(UserMiddleItem userMiddleItem) {
        return USER_MIDDLE_ITEM;
    }

    @Override
    public int type(UserHeaderItem userHeaderItem) {
        return USER_HEADER_ITEM;
    }

    @Override
    public int type(AnchorDetail anchorDetail) {
        int displayStyle = anchorDetail.getDisplayStyle();
        if (anchorDetail.getList() != null && anchorDetail.getList().size() > 0) {
            for (AnchorArticle anchorArticle : anchorDetail.getList()) {
                anchorArticle.setDisplayStyle(displayStyle);
            }
        }
        if (anchorDetail.getDisplayStyle() == 0) {
            int size = anchorDetail.getList().size();
            if (size > 3 && size < 6) {
                anchorDetail.setList(anchorDetail.getList().subList(0, 3));
            }
        }
        return ANCHOR_RECYCLER_ITEM;
    }

    @Override
    public int type(AnchorArticle anchorArticle) {
        switch (anchorArticle.getDisplayStyle()) {
            case 2:
                return ANCHOR_ONE_ITEM;
            default:
                return ANCHOR_THREE_ITEM;
        }
    }

    @Override
    public int type(SaleList saleList) {
        return SALE_LIST_ITEM;
    }

    @Override
    public int type(FocusImage focusImage) {
        List<FocusPicture> list = focusImage.getList();
        if (list.size() == 1) {
            return SALE_BANNER_ONE_ITEM;
        } else {
            return 0;
        }
    }

    @Override
    public int type(SaleDetail saleDetail) {
        return SALE_DETAIL_ITEM;
    }

    @Override
    public int type(HotList hotList) {
        if (hotList.getModuleType().equals("focus")) {
            return HOT_BANNER_ITEM;
        } else if (hotList.getModuleType().equals("square")) {
            return COMMON_RECYCLER_ITEM;
        } else {
            return HOT_RECYCLER_ITEM;

        }
    }

    @Override
    public int type(HotBean bean) {
        return 0;
    }

    @Override
    public int type(TypeBean bean) {
        if (bean.getType() == 1) {
            return TYPE_BANNER_ONE__ITEM;
        }
        return TYPE_BUTTON_ITEM;
    }

    @Override
    public int type(RecyclerBean bean) {
        return TYPE_RECYCLER_ITEM;
    }

    @Override
    public BaseRecyclerHolder createHolder(int itemType, View itemView, BaseRecyclerAdapter adapter) {
        switch (itemType) {
            case USER_ITEM:
                return new UserItemHolder(itemView, adapter);
            case USER_MIDDLE_ITEM:
                return new UserMiddleItemHolder(itemView, adapter);
            case USER_HEADER_ITEM:
                return new UserHeadItemHolder(itemView, adapter);
            case ANCHOR_RECYCLER_ITEM:
                return new AnchorRecyclerHolder(itemView, adapter);
            case ANCHOR_THREE_ITEM:
                return new AnchorThreeItem(itemView, adapter);
            case ANCHOR_ONE_ITEM:
                return new AnchorOneItem(itemView, adapter);
            case SALE_BANNER_ONE_ITEM:
                return new SaleBannerOneItemHolder(itemView, adapter);
            case SALE_LIST_ITEM:
                return new SaleListItemHolder(itemView, adapter);
            case SALE_DETAIL_ITEM:
                return new SaleDetailItemHolder(itemView, adapter);
            case HOT_BANNER_ITEM:
                return new HotBannerItemHolder(itemView, adapter);
            case COMMON_RECYCLER_ITEM:
                return new HotSqureItemHolder(itemView, adapter);
            case HOT_RECYCLER_ITEM:
                return new HotRecyclerItemHolder(itemView, adapter);
            case TYPE_BANNER_ONE__ITEM:
                return new TypeBannerOneItemHolder(itemView, adapter);
            case TYPE_RECYCLER_ITEM:
                return new TypeRecyclerItemHolder(itemView, adapter);
            case TYPE_BUTTON_ITEM:
                return new TypeButtonItemHolder(itemView, adapter);

        }
        return null;
    }
}
