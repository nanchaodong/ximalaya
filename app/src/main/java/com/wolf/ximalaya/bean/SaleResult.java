package com.wolf.ximalaya.bean;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class SaleResult {
    private String msg;
    private String ret;
    private List<SaleList> datas;
    private FocusImage focusImages;

    public SaleResult(String msg, String ret, List<SaleList> datas, FocusImage focusImages) {
        this.msg = msg;
        this.ret = ret;
        this.datas = datas;
        this.focusImages = focusImages;
    }

    public SaleResult() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public List<SaleList> getDatas() {
        return datas;
    }

    public void setDatas(List<SaleList> datas) {
        this.datas = datas;
    }

    public FocusImage getFocusImages() {
        return focusImages;
    }

    public void setFocusImages(FocusImage focusImages) {
        this.focusImages = focusImages;
    }

    @Override
    public String toString() {
        return "SaleResult{" +
                "msg='" + msg + '\'' +
                ", ret='" + ret + '\'' +
                ", datas=" + datas +
                ", focusImages=" + focusImages +
                '}';
    }
}
