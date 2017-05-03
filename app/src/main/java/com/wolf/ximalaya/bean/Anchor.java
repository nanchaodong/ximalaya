package com.wolf.ximalaya.bean;

import java.util.List;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class Anchor {
    private String ret;
    private String msg;
    private List<AnchorDetail> famous;
    private List<AnchorDetail> normal;

    public Anchor(String ret, String msg, List<AnchorDetail> famous, List<AnchorDetail> normal) {
        this.ret = ret;
        this.msg = msg;
        this.famous = famous;
        this.normal = normal;
    }

    public Anchor() {
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<AnchorDetail> getFamous() {
        return famous;
    }

    public void setFamous(List<AnchorDetail> famous) {
        this.famous = famous;
    }

    public List<AnchorDetail> getNormal() {
        return normal;
    }

    public void setNormal(List<AnchorDetail> normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "ret='" + ret + '\'' +
                ", msg='" + msg + '\'' +
                ", famous=" + famous +
                ", normal=" + normal +
                '}';
    }
}
