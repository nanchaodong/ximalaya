package com.wolf.ximalaya.holder;

import android.view.View;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.base.BaseRecyclerHolder;
import com.wolf.ximalaya.bean.HotBean;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.databinding.HotBannerItemBinding;
import com.wolf.ximalaya.utils.PicassoImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class HotBannerItemHolder extends BaseRecyclerHolder<HotList, HotBannerItemBinding> {
    private List<String> list;

    public HotBannerItemHolder(View itemView, BaseRecyclerAdapter adapter) {
        super(itemView, adapter);
        list = new ArrayList<>();

    }

    @Override
    public void setUp(HotList model, int position) {
        list.clear();
        for (HotBean hotBean : model.getList()) {
            list.add(hotBean.getPic());
        }
        bindView.banner.setImageLoader(new PicassoImageLoader()).setImages(list).start();

    }
}
