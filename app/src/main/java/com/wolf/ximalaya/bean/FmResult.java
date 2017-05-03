package com.wolf.ximalaya.bean;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/3.
 */

public class FmResult<T> {
    private int ret;
    private String msg;
    private List<T> list;

    public FmResult(int ret, String msg, List<T> list) {
        this.ret = ret;
        this.msg = msg;
        this.list = list;
    }

    public FmResult() {
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "FmResult{" +
                "ret=" + ret +
                ", msg='" + msg + '\'' +
                ", list=" + list +
                '}';
    }
}
