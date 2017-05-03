package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class AnchorArticle implements PresentImpl {
    private String uid;
    private String nickname;
    private String smallLogo;
    private String middleLogo;
    private String largeLogo;
    private boolean isVerified;
    private String tracksCounts;
    private int followersCounts;
    private String personDescribe;
    private String verifyTitle;
    private int displayStyle;

    public AnchorArticle(String uid, String nickname, String smallLogo, String middleLogo, String largeLogo, boolean isVerified, String tracksCounts, int followersCounts, String personDescribe, String verifyTitle) {
        this.uid = uid;
        this.nickname = nickname;
        this.smallLogo = smallLogo;
        this.middleLogo = middleLogo;
        this.largeLogo = largeLogo;
        this.isVerified = isVerified;
        this.tracksCounts = tracksCounts;
        this.followersCounts = followersCounts;
        this.personDescribe = personDescribe;
        this.verifyTitle = verifyTitle;
    }

    public AnchorArticle() {
    }

    public int getDisplayStyle() {
        return displayStyle;
    }

    public void setDisplayStyle(int displayStyle) {
        this.displayStyle = displayStyle;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSmallLogo() {
        return smallLogo;
    }

    public void setSmallLogo(String smallLogo) {
        this.smallLogo = smallLogo;
    }

    public String getMiddleLogo() {
        return middleLogo;
    }

    public void setMiddleLogo(String middleLogo) {
        this.middleLogo = middleLogo;
    }

    public String getLargeLogo() {
        return largeLogo;
    }

    public void setLargeLogo(String largeLogo) {
        this.largeLogo = largeLogo;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getTracksCounts() {
        return tracksCounts;
    }

    public void setTracksCounts(String tracksCounts) {
        this.tracksCounts = tracksCounts;
    }

    public int getFollowersCounts() {
        return followersCounts;
    }

    public void setFollowersCounts(int followersCounts) {
        this.followersCounts = followersCounts;
    }

    public String getPersonDescribe() {
        return personDescribe;
    }

    public void setPersonDescribe(String personDescribe) {
        this.personDescribe = personDescribe;
    }

    public String getVerifyTitle() {
        return verifyTitle;
    }

    public void setVerifyTitle(String verifyTitle) {
        this.verifyTitle = verifyTitle;
    }

    @Override
    public String toString() {
        return "AnchorArticle{" +
                "uid='" + uid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", smallLogo='" + smallLogo + '\'' +
                ", middleLogo='" + middleLogo + '\'' +
                ", largeLogo='" + largeLogo + '\'' +
                ", isVerified=" + isVerified +
                ", tracksCounts='" + tracksCounts + '\'' +
                ", followersCounts='" + followersCounts + '\'' +
                ", personDescribe='" + personDescribe + '\'' +
                ", verifyTitle='" + verifyTitle + '\'' +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
