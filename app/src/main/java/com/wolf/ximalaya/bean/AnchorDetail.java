package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class AnchorDetail implements PresentImpl{
    private String id;
    private String title;
    private int displayStyle;
    private String name;
    private List<AnchorArticle> list;

    public AnchorDetail(String id, String title, int displayStyle, List<AnchorArticle> list) {
        this.id = id;
        this.title = title;
        this.displayStyle = displayStyle;
        this.list = list;
    }

    public AnchorDetail() {
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

    public int getDisplayStyle() {
        return displayStyle;
    }

    public void setDisplayStyle(int displayStyle) {
        this.displayStyle = displayStyle;
    }

    public List<AnchorArticle> getList() {
        return list;
    }

    public void setList(List<AnchorArticle> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AnchorFamous{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", displayStyle=" + displayStyle +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
