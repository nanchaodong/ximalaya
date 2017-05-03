package com.wolf.ximalaya.constant;

import com.google.gson.reflect.TypeToken;
import com.wolf.ximalaya.App;
import com.wolf.ximalaya.base.BaseFragment;
import com.wolf.ximalaya.bean.TabBtn;
import com.wolf.ximalaya.bean.TabEntity;
import com.wolf.ximalaya.bean.UserHeaderItem;
import com.wolf.ximalaya.bean.UserItem;
import com.wolf.ximalaya.bean.UserMiddleItem;
import com.wolf.ximalaya.fragment.FindFragment;
import com.wolf.ximalaya.fragment.MainFragment;
import com.wolf.ximalaya.fragment.MyFragment;
import com.wolf.ximalaya.fragment.ReadFragment;
import com.wolf.ximalaya.fragment.TabAnchorFragment;
import com.wolf.ximalaya.fragment.TabHotFragment;
import com.wolf.ximalaya.fragment.TabRecommedFragment;
import com.wolf.ximalaya.fragment.TabSaleFragment;
import com.wolf.ximalaya.fragment.TabTypeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class Json {
    private static final String BOTTON_JSON = "[{\"imageNomal\":\"android.resource://com.wolf.ximalaya/mipmap/tab4\",\"imageSelected\":\"android.resource://com.wolf.ximalaya/mipmap/tab4_down\",\"tabName\":\"首页\",\"isSelected\":true,\"index\":0},{\"imageNomal\":\"android.resource://com.wolf.ximalaya/mipmap/tab1\",\"imageSelected\":\"android.resource://com.wolf.ximalaya/mipmap/tab1_down\",\"tabName\":\"订阅\",\"isSelected\":false,\"index\":1},{\"imageNomal\":\"android.resource://com.wolf.ximalaya/mipmap/tab2\",\"imageSelected\":\"android.resource://com.wolf.ximalaya/mipmap/tab2_down\",\"tabName\":\"发现\",\"isSelected\":false,\"index\":2},{\"imageNomal\":\"android.resource://com.wolf.ximalaya/mipmap/tab5\",\"imageSelected\":\"android.resource://com.wolf.ximalaya/mipmap/tab5_down\",\"tabName\":\"我的\",\"isSelected\":false,\"index\":3}]";
    private static final String USER_ITEM_JSON = "[{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_buy\",\"leftTitle\":\"我的已购\"},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"我的钱包\"},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"我的优惠券\"},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"分享赚钱\",\"rightTitle\":\"佣金最高达30%\",\"bottom\":true},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"我喜欢的\"},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"更多\",\"bottom\":true},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"意见反馈\"},{\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_wd_ximoney\",\"leftTitle\":\"设置\",\"bottom\":true}]";
    private static final String USER_MIDDLE_JSON = "{\"topImage\":\"android.resource://com.wolf.ximalaya/mipmap/tab2\",\"topTitle\":\"开始录音\",\"bottomImage\":\"android.resource://com.wolf.ximalaya/mipmap/ic_jmgl\",\"bottomTitle\":\"主播中心\"}";
    private static final String USER_HEAD_JSON = "{\"leftTopIcon\":\"android.resource://com.wolf.ximalaya/mipmap/icon_message_box\",\"rightTopIcon\":\"android.resource://com.wolf.ximalaya/mipmap/saoyisao\",\"user\":{\"headerUrl\":\"android.resource://com.wolf.ximalaya/mipmap/icon_header_default\"},\"leftText\":\"历史\",\"middleText\":\"订阅\",\"rightText\":\"下载\",\"leftImage\":\"android.resource://com.wolf.ximalaya/mipmap/icon_history\",\"middleImage\":\"android.resource://com.wolf.ximalaya/mipmap/icon_subscription\",\"rightImage\":\"android.resource://com.wolf.ximalaya/mipmap/icon_download\",bgIcon:\"android.resource://com.wolf.ximalaya/mipmap/icon_user_head_item\"}";

    //获得tab按钮
    public static List<TabBtn> getBottom() {
        List<TabBtn> list = App.getList(BOTTON_JSON, new TypeToken<List<TabBtn>>() {
        }.getType());
        return list;
    }

    public static List<UserItem> getUserItem() {
        List<UserItem> list = App.getList(USER_ITEM_JSON, new TypeToken<List<UserItem>>() {
        }.getType());
        return list;
    }

    public static UserMiddleItem getUserMiddleItem() {
        UserMiddleItem middleItem = (UserMiddleItem) App.getObject(USER_MIDDLE_JSON, new TypeToken<UserMiddleItem>() {
        }.getType());
        return middleItem;
    }

    public static UserHeaderItem getUserHeaderItem() {
        UserHeaderItem headerItem = (UserHeaderItem) App.getObject(USER_HEAD_JSON, new TypeToken<UserHeaderItem>() {
        }.getType());
        return headerItem;
    }

    public static List<BaseFragment> getBaseFragments() {
        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(new MainFragment());
        fragments.add(new ReadFragment());
        fragments.add(new FindFragment());
        fragments.add(new MyFragment());
        return fragments;
    }

    public static List<TabEntity> getTabs() {

        List<TabEntity> tabEntities = new ArrayList<>();
        TabEntity tabEntity = new TabEntity("推荐", new TabRecommedFragment());
        tabEntities.add(tabEntity);
        TabEntity tabEntity1 = new TabEntity("热门", new TabHotFragment());
        tabEntities.add(tabEntity1);
        TabEntity tabEntity2 = new TabEntity("分类", new TabTypeFragment());
        tabEntities.add(tabEntity2);
        TabEntity tabEntity3 = new TabEntity("榜单", new TabSaleFragment());
        tabEntities.add(tabEntity3);
        TabEntity tabEntity4 = new TabEntity("主播", new TabAnchorFragment());
        tabEntities.add(tabEntity4);
        return tabEntities;
    }

}
