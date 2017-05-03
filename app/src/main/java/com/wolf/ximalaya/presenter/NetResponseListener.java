package com.wolf.ximalaya.presenter;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public interface NetResponseListener {
    void success();
    void fail(Throwable throwable);
}
