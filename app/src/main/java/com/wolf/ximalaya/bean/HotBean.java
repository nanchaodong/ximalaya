package com.wolf.ximalaya.bean;

import android.util.Log;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class HotBean implements PresentImpl {

    private String albumId;
    private String focusCurrentId;
    private String id;
    private boolean isShare;
    private boolean is_External_url;
    private String longTitle;
    private String pic;
    private String roomId;
    private String shortTitle;
    private int type;
    private String uid;
    private String bubbleText;
    private String contentType;
    private String contentUpdateAt;
    private String coverPath;
    private boolean enableShare;
    private boolean isExternalUrl;
    private String sharePic;
    private String subTitle;
    private String title;
    private String url;
    private String infoType;
    private int isFinished;
    private boolean isPaid;
    private long lastUptrackAt;
    private long playsCount;
    private String recSic;
    private String recTrack;
    private int refundSupportType;
    private int tracksCount;
    private String commentScore;
    private String commentsCount;
    private String discountedPrice;
    private String price;
    private int priceTypeEnum;

    public HotBean(String albumId, String focusCurrentId, String id, boolean isShare, boolean is_External_url, String longTitle, String pic, String roomId, String shortTitle, int type, String uid, String bubbleText, String contentType, String contentUpdateAt, String coverPath, boolean enableShare, boolean isExternalUrl, String sharePic, String subTitle, String title, String url, String infoType, int isFinished, boolean isPaid, long lastUptrackAt, long playsCount, String recSic, String recTrack, int refundSupportType, int tracksCount, String commentScore, String commentsCount, String discountedPrice, String price, int priceTypeEnum) {
        this.albumId = albumId;
        this.focusCurrentId = focusCurrentId;
        this.id = id;
        this.isShare = isShare;
        this.is_External_url = is_External_url;
        this.longTitle = longTitle;
        this.pic = pic;
        this.roomId = roomId;
        this.shortTitle = shortTitle;
        this.type = type;
        this.uid = uid;
        this.bubbleText = bubbleText;
        this.contentType = contentType;
        this.contentUpdateAt = contentUpdateAt;
        this.coverPath = coverPath;
        this.enableShare = enableShare;
        this.isExternalUrl = isExternalUrl;
        this.sharePic = sharePic;
        this.subTitle = subTitle;
        this.title = title;
        this.url = url;
        this.infoType = infoType;
        this.isFinished = isFinished;
        this.isPaid = isPaid;
        this.lastUptrackAt = lastUptrackAt;
        this.playsCount = playsCount;
        this.recSic = recSic;
        this.recTrack = recTrack;
        this.refundSupportType = refundSupportType;
        this.tracksCount = tracksCount;
        this.commentScore = commentScore;
        this.commentsCount = commentsCount;
        this.discountedPrice = discountedPrice;
        this.price = price;
        this.priceTypeEnum = priceTypeEnum;
    }

    public HotBean() {
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getFocusCurrentId() {
        return focusCurrentId;
    }

    public void setFocusCurrentId(String focusCurrentId) {
        this.focusCurrentId = focusCurrentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isShare() {
        return isShare;
    }

    public void setShare(boolean share) {
        isShare = share;
    }

    public boolean is_External_url() {
        return is_External_url;
    }

    public void setIs_External_url(boolean is_External_url) {
        this.is_External_url = is_External_url;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBubbleText() {
        return bubbleText;
    }

    public void setBubbleText(String bubbleText) {
        this.bubbleText = bubbleText;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentUpdateAt() {
        return contentUpdateAt;
    }

    public void setContentUpdateAt(String contentUpdateAt) {
        this.contentUpdateAt = contentUpdateAt;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public boolean isEnableShare() {
        return enableShare;
    }

    public void setEnableShare(boolean enableShare) {
        this.enableShare = enableShare;
    }

    public boolean isExternalUrl() {
        return isExternalUrl;
    }

    public void setExternalUrl(boolean externalUrl) {
        isExternalUrl = externalUrl;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public int getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(int isFinished) {
        this.isFinished = isFinished;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public long getLastUptrackAt() {
        return lastUptrackAt;
    }

    public void setLastUptrackAt(long lastUptrackAt) {
        this.lastUptrackAt = lastUptrackAt;
    }

    public long getPlaysCount() {
        return playsCount;
    }

    public void setPlaysCount(long playsCount) {
        this.playsCount = playsCount;
    }

    public String getRecSic() {
        return recSic;
    }

    public void setRecSic(String recSic) {
        this.recSic = recSic;
    }

    public String getRecTrack() {
        return recTrack;
    }

    public void setRecTrack(String recTrack) {
        this.recTrack = recTrack;
    }

    public int getRefundSupportType() {
        return refundSupportType;
    }

    public void setRefundSupportType(int refundSupportType) {
        this.refundSupportType = refundSupportType;
    }

    public int getTracksCount() {
        return tracksCount;
    }

    public void setTracksCount(int tracksCount) {
        this.tracksCount = tracksCount;
    }

    public String getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(String commentScore) {
        this.commentScore = commentScore;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPriceTypeEnum() {
        return priceTypeEnum;
    }

    public void setPriceTypeEnum(int priceTypeEnum) {
        this.priceTypeEnum = priceTypeEnum;
    }

    @Override
    public String toString() {
        return "HotBean{" +
                "albumId='" + albumId + '\'' +
                ", focusCurrentId='" + focusCurrentId + '\'' +
                ", id='" + id + '\'' +
                ", isShare=" + isShare +
                ", is_External_url=" + is_External_url +
                ", longTitle='" + longTitle + '\'' +
                ", pic='" + pic + '\'' +
                ", roomId='" + roomId + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", type=" + type +
                ", uid='" + uid + '\'' +
                ", bubbleText='" + bubbleText + '\'' +
                ", contentType='" + contentType + '\'' +
                ", contentUpdateAt='" + contentUpdateAt + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", enableShare=" + enableShare +
                ", isExternalUrl=" + isExternalUrl +
                ", sharePic='" + sharePic + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", infoType='" + infoType + '\'' +
                ", isFinished=" + isFinished +
                ", isPaid=" + isPaid +
                ", lastUptrackAt=" + lastUptrackAt +
                ", playsCount=" + playsCount +
                ", recSic='" + recSic + '\'' +
                ", recTrack='" + recTrack + '\'' +
                ", refundSupportType=" + refundSupportType +
                ", tracksCount=" + tracksCount +
                ", commentScore='" + commentScore + '\'' +
                ", commentsCount='" + commentsCount + '\'' +
                ", discountedPrice='" + discountedPrice + '\'' +
                ", price='" + price + '\'' +
                ", priceTypeEnum=" + priceTypeEnum +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
