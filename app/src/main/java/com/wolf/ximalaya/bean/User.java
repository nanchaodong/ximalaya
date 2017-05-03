package com.wolf.ximalaya.bean;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryImpl;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class User implements PresentImpl {
    private String headerUrl;

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    @Override
    public int type(TypeFactoryImpl typeFactory) {
        return 0;
    }
}
