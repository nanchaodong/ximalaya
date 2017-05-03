package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class UserMiddleItem implements PresentImpl{
    private String topImage;
    private String bottomImage;
    private String topTitle;
    private String bottomTitle;

    public UserMiddleItem(String topImage, String bottomImage, String topTitle, String bottomTitle) {
        this.topImage = topImage;
        this.bottomImage = bottomImage;
        this.topTitle = topTitle;
        this.bottomTitle = bottomTitle;
    }

    public UserMiddleItem() {
    }

    public String getTopImage() {
        return topImage;
    }

    public void setTopImage(String topImage) {
        this.topImage = topImage;
    }

    public String getBottomImage() {
        return bottomImage;
    }

    public void setBottomImage(String bottomImage) {
        this.bottomImage = bottomImage;
    }

    public String getTopTitle() {
        return topTitle;
    }

    public void setTopTitle(String topTitle) {
        this.topTitle = topTitle;
    }

    public String getBottomTitle() {
        return bottomTitle;
    }

    public void setBottomTitle(String bottomTitle) {
        this.bottomTitle = bottomTitle;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
