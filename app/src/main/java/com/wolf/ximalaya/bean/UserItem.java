package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class UserItem implements PresentImpl {
    private String leftImage;
    private String leftTitle;
    private String rightTitle;
    private boolean bottom;


    public UserItem(String leftImage, String leftTitle, String rightTitle) {
        this.leftImage = leftImage;
        this.leftTitle = leftTitle;
        this.rightTitle = rightTitle;
    }

    public UserItem() {
    }

    public boolean isBottom() {
        return bottom;
    }

    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }

    public String getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(String leftImage) {
        this.leftImage = leftImage;
    }

    public String getLeftTitle() {
        return leftTitle;
    }

    public void setLeftTitle(String leftTitle) {
        this.leftTitle = leftTitle;
    }

    public String getRightTitle() {
        return rightTitle;
    }

    public void setRightTitle(String rightTitle) {
        this.rightTitle = rightTitle;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
