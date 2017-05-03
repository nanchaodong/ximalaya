package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class TypeBean implements PresentImpl {
    private String id;
    private String name;
    private String title;
    private boolean isChecked;
    private String orderNum;
    private String coverPath;
    private String selectedSwitch;
    private boolean isFinished;
    private String contentType;
    private String categoryType;
    private boolean filterSupport;
    private boolean isPaid;
    private int type;

    public TypeBean(String id, String name, String title, boolean isChecked, String orderNum, String coverPath, String selectedSwitch, boolean isFinished, String contentType, String categoryType, boolean filterSupport, boolean isPaid, int type) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.isChecked = isChecked;
        this.orderNum = orderNum;
        this.coverPath = coverPath;
        this.selectedSwitch = selectedSwitch;
        this.isFinished = isFinished;
        this.contentType = contentType;
        this.categoryType = categoryType;
        this.filterSupport = filterSupport;
        this.isPaid = isPaid;
        this.type = type;
    }

    public TypeBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getSelectedSwitch() {
        return selectedSwitch;
    }

    public void setSelectedSwitch(String selectedSwitch) {
        this.selectedSwitch = selectedSwitch;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public boolean isFilterSupport() {
        return filterSupport;
    }

    public void setFilterSupport(boolean filterSupport) {
        this.filterSupport = filterSupport;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }

    @Override
    public String toString() {
        return "TypeBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", isChecked=" + isChecked +
                ", orderNum='" + orderNum + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", selectedSwitch='" + selectedSwitch + '\'' +
                ", isFinished=" + isFinished +
                ", contentType='" + contentType + '\'' +
                ", categoryType='" + categoryType + '\'' +
                ", filterSupport=" + filterSupport +
                ", isPaid=" + isPaid +
                ", type=" + type +
                '}';
    }
}
