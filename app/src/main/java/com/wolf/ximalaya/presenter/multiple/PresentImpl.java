package com.wolf.ximalaya.presenter.multiple;

import java.io.Serializable;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public interface PresentImpl extends Serializable {
    int type(TypeFactoryImpl typeFactory);
}
