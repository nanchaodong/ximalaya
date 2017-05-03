package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleDetail implements PresentImpl {
    private String ret;
    private String maxPageId;
    private String totalCount;
    private String pageId;
    private String pageSize;
    private boolean isAllPaid;
    private String rankingListId;
    private String coverPath;
    private String title;
    private String subTitle;
    private String key;
    private String orderNum;
    private String contentType;
    private String rankRule;
    private String period;
    private String categoryId;
    private String firstId;
    private String calcPeriod;
    private String top;
    private List<FirstKResult> firstKResults;

    public SaleDetail(String ret, String maxPageId, String totalCount, String pageId, String pageSize, boolean isAllPaid, String rankingListId, String coverPath, String title, String subTitle, String key, String orderNum, String contentType, String rankRule, String period, String categoryId, String firstId, String calcPeriod, String top, List<FirstKResult> firstKResults) {
        this.ret = ret;
        this.maxPageId = maxPageId;
        this.totalCount = totalCount;
        this.pageId = pageId;
        this.pageSize = pageSize;
        this.isAllPaid = isAllPaid;
        this.rankingListId = rankingListId;
        this.coverPath = coverPath;
        this.title = title;
        this.subTitle = subTitle;
        this.key = key;
        this.orderNum = orderNum;
        this.contentType = contentType;
        this.rankRule = rankRule;
        this.period = period;
        this.categoryId = categoryId;
        this.firstId = firstId;
        this.calcPeriod = calcPeriod;
        this.top = top;
        this.firstKResults = firstKResults;
    }

    public SaleDetail() {
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMaxPageId() {
        return maxPageId;
    }

    public void setMaxPageId(String maxPageId) {
        this.maxPageId = maxPageId;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isAllPaid() {
        return isAllPaid;
    }

    public void setAllPaid(boolean allPaid) {
        isAllPaid = allPaid;
    }

    public String getRankingListId() {
        return rankingListId;
    }

    public void setRankingListId(String rankingListId) {
        this.rankingListId = rankingListId;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getRankRule() {
        return rankRule;
    }

    public void setRankRule(String rankRule) {
        this.rankRule = rankRule;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getCalcPeriod() {
        return calcPeriod;
    }

    public void setCalcPeriod(String calcPeriod) {
        this.calcPeriod = calcPeriod;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public List<FirstKResult> getFirstKResults() {
        return firstKResults;
    }

    public void setFirstKResults(List<FirstKResult> firstKResults) {
        this.firstKResults = firstKResults;
    }

    @Override
    public String toString() {
        return "SaleDetail{" +
                "ret='" + ret + '\'' +
                ", maxPageId='" + maxPageId + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", pageId='" + pageId + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", isAllPaid=" + isAllPaid +
                ", rankingListId='" + rankingListId + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", key='" + key + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", contentType='" + contentType + '\'' +
                ", rankRule='" + rankRule + '\'' +
                ", period='" + period + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", firstId='" + firstId + '\'' +
                ", calcPeriod='" + calcPeriod + '\'' +
                ", top='" + top + '\'' +
                ", firstKResults=" + firstKResults +
                '}';
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return typeFactory.type(this);
    }
}
