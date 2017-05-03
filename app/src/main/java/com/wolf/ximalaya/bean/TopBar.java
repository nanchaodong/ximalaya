package com.wolf.ximalaya.bean;

import android.media.Image;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class TopBar {
    private int leftImage;
    private String leftText;
    private int rightImage;
    private String rightText;
    private int rightTwoImage;
    private String rightTwoText;
    private String title;

    public TopBar(int leftImage, String leftText, int rightImage, String rightText, int rightTwoImage, String rightTwoText) {
        this.leftImage = leftImage;
        this.leftText = leftText;
        this.rightImage = rightImage;
        this.rightText = rightText;
        this.rightTwoImage = rightTwoImage;
        this.rightTwoText = rightTwoText;
    }

    public TopBar() {
    }

    public int getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(int leftImage) {
        this.leftImage = leftImage;
    }

    public String getLeftText() {
        return leftText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }

    public int getRightImage() {
        return rightImage;
    }

    public void setRightImage(int rightImage) {
        this.rightImage = rightImage;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public int getRightTwoImage() {
        return rightTwoImage;
    }

    public void setRightTwoImage(int rightTwoImage) {
        this.rightTwoImage = rightTwoImage;
    }

    public String getRightTwoText() {
        return rightTwoText;
    }

    public void setRightTwoText(String rightTwoText) {
        this.rightTwoText = rightTwoText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
