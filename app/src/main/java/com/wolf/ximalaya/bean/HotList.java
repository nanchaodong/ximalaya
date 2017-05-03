package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class HotList implements PresentImpl {
    private boolean bottomHasMore;
    private boolean hasMore;
    private int loopCount;
    private String moduleType;
    private String title;
    private String direction;
    private String subcategoryId;
    private List<HotBean> list;

    public HotList(boolean bottomHasMore, boolean hasMore, int loopCount, String moduleType, String title, String direction, String subcategoryId, List<HotBean> list) {
        this.bottomHasMore = bottomHasMore;
        this.hasMore = hasMore;
        this.loopCount = loopCount;
        this.moduleType = moduleType;
        this.title = title;
        this.direction = direction;
        this.subcategoryId = subcategoryId;
        this.list = list;
    }

    public HotList() {
    }

    public boolean isBottomHasMore() {
        return bottomHasMore;
    }

    public void setBottomHasMore(boolean bottomHasMore) {
        this.bottomHasMore = bottomHasMore;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getLoopCount() {
        return loopCount;
    }

    public void setLoopCount(int loopCount) {
        this.loopCount = loopCount;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public List<HotBean> getList() {
        return list;
    }

    public void setList(List<HotBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HotList{" +
                "bottomHasMore=" + bottomHasMore +
                ", hasMore=" + hasMore +
                ", loopCount=" + loopCount +
                ", moduleType='" + moduleType + '\'' +
                ", title='" + title + '\'' +
                ", direction='" + direction + '\'' +
                ", subcategoryId='" + subcategoryId + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
