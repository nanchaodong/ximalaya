package com.wolf.ximalaya.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wolf.ximalaya.R;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class PicassoImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Picasso.with(imageView.getContext()).load((String) path).placeholder(R.mipmap.live_img_default).error(R.mipmap.live_img_default).into(imageView);

    }
}
