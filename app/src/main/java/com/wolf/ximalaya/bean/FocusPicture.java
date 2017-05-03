package com.wolf.ximalaya.bean;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class FocusPicture {
    private String id;
    private String shortTitle;
    private String longTitle;
    private String pic;
    private int type;
    private String url;
    private boolean isShare;
    private boolean is_External;
    private String focusCurrentId;
    private String roomId;

    public FocusPicture(String id, String shortTitle, String longTitle, String pic, int type, String url, boolean isShare, boolean is_External, String focusCurrentId, String roomId) {
        this.id = id;
        this.shortTitle = shortTitle;
        this.longTitle = longTitle;
        this.pic = pic;
        this.type = type;
        this.url = url;
        this.isShare = isShare;
        this.is_External = is_External;
        this.focusCurrentId = focusCurrentId;
        this.roomId = roomId;
    }

    public FocusPicture() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isShare() {
        return isShare;
    }

    public void setShare(boolean share) {
        isShare = share;
    }

    public boolean is_External() {
        return is_External;
    }

    public void setIs_External(boolean is_External) {
        this.is_External = is_External;
    }

    public String getFocusCurrentId() {
        return focusCurrentId;
    }

    public void setFocusCurrentId(String focusCurrentId) {
        this.focusCurrentId = focusCurrentId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "FocusPicture{" +
                "id='" + id + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", longTitle='" + longTitle + '\'' +
                ", pic='" + pic + '\'' +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", isShare=" + isShare +
                ", is_External=" + is_External +
                ", focusCurrentId='" + focusCurrentId + '\'' +
                ", roomId='" + roomId + '\'' +
                '}';
    }
}
