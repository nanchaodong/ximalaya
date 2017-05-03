package com.wolf.ximalaya.bean;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class FirstKResult {
    private String id;
    private String title;
    private String contentType;

    public FirstKResult(String id, String title, String contentType) {
        this.id = id;
        this.title = title;
        this.contentType = contentType;
    }

    public FirstKResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "FirstKResult{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
