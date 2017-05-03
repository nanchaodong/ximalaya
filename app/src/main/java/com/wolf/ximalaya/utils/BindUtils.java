package com.wolf.ximalaya.utils;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.media.Image;
import android.service.voice.VoiceInteractionService;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wolf.ximalaya.R;
import com.wolf.ximalaya.bean.TabBtn;
import com.wolf.ximalaya.view.TabView;
import com.wolf.ximalaya.view.TopView;
import com.wolf.ximalaya.viewmodel.TopBarViewModel;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class BindUtils {
    @BindingAdapter("tabBtn")
    public static void showTab(TabView tabView, TabBtn tabBtn) {
        tabView.setUp(tabBtn);
    }


    @BindingAdapter("imageUrl")
    public static void showImageUrl(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }

    @BindingAdapter("imageId")
    public static void showImageId(ImageView imageView, int id) {
        if (id != 0)
            Picasso.with(imageView.getContext()).load(id).into(imageView);

    }

    @BindingAdapter("topBarViewModel")
    public static void showTop(TopView topView, TopBarViewModel topBarViewModel) {
        topView.setTopbar(topBarViewModel);

    }

    @BindingAdapter("anchorUrl")
    public static void showResize(ImageView imageView, String url) {
        int screenWidth = ScreenUtils.getScreenWidth();
        int outWidth = ScreenUtils.dpToPx(R.dimen.d92);
        int imageWidth = (screenWidth - outWidth) / 3;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageWidth;
        layoutParams.height = imageWidth;
        imageView.setLayoutParams(layoutParams);
        Picasso.with(imageView.getContext())
                .load(url)
                .placeholder(R.mipmap.live_img_default)
                .error(R.mipmap.live_img_default)
                .into(imageView);

    }

    @BindingAdapter("followers")
    public static void showFlower(TextView textView, int count) {
        int i = count / 10000;
        textView.setText(i + "万");
    }

    @BindingAdapter("commonUrl")
    public static void showCommonUrl(ImageView imageView, String url) {
        Picasso.with(imageView.getContext())
                .load(url)
                .placeholder(R.mipmap.live_img_default)
                .error(R.mipmap.live_img_default)
                .into(imageView);
    }

}
