package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class UserHeaderItem implements PresentImpl {
    private String leftTopIcon;
    private String rightTopIcon;
    private User user;
    private String leftText;
    private String leftImage;
    private String middleText;
    private String middleImage;
    private String rightText;
    private String rightImage;
    private String bgIcon;

    public UserHeaderItem(String leftTopIcon, String rightTopIcon, User user, String leftText, String leftImage, String middleText, String middleImage, String rightText, String rightImage) {
        this.leftTopIcon = leftTopIcon;
        this.rightTopIcon = rightTopIcon;
        this.user = user;
        this.leftText = leftText;
        this.leftImage = leftImage;
        this.middleText = middleText;
        this.middleImage = middleImage;
        this.rightText = rightText;
        this.rightImage = rightImage;
    }

    public UserHeaderItem() {
    }

    public String getBgIcon() {
        return bgIcon;
    }

    public void setBgIcon(String bgIcon) {
        this.bgIcon = bgIcon;
    }

    public String getLeftTopIcon() {
        return leftTopIcon;
    }

    public void setLeftTopIcon(String leftTopIcon) {
        this.leftTopIcon = leftTopIcon;
    }

    public String getRightTopIcon() {
        return rightTopIcon;
    }

    public void setRightTopIcon(String rightTopIcon) {
        this.rightTopIcon = rightTopIcon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLeftText() {
        return leftText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }

    public String getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(String leftImage) {
        this.leftImage = leftImage;
    }

    public String getMiddleText() {
        return middleText;
    }

    public void setMiddleText(String middleText) {
        this.middleText = middleText;
    }

    public String getMiddleImage() {
        return middleImage;
    }

    public void setMiddleImage(String middleImage) {
        this.middleImage = middleImage;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightImage() {
        return rightImage;
    }

    public void setRightImage(String rightImage) {
        this.rightImage = rightImage;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
