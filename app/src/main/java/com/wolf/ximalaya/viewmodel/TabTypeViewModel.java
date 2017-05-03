package com.wolf.ximalaya.viewmodel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.bean.FmResult;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.bean.RecyclerBean;
import com.wolf.ximalaya.bean.TypeBean;
import com.wolf.ximalaya.presenter.CommonList;
import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.utils.http.RetrofitHelper;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabTypeViewModel extends CommonList {
    private static final String TAG = "TabTypeViewModel";

    public TabTypeViewModel(Context context, RecyclerView recyclerView, int spanCount, BaseRecyclerAdapter adapter) {
        super(context, recyclerView, spanCount, adapter);
    }

    @Override
    public void loadTop() {

        RetrofitHelper.getInstance().getService().getTypeList("http://mobile.ximalaya.com/mobile/discovery/v1/categories", "and-f5.cpd2", "android", "13", "2")
                .map(new Func1<FmResult<TypeBean>, List<PresentImpl>>() {
                    @Override
                    public List<PresentImpl> call(FmResult<TypeBean> typeBeanFmResult) {
                        List<PresentImpl> list = new ArrayList<PresentImpl>();
                        typeBeanFmResult.getList().get(0).setType(1);
                        list.add(typeBeanFmResult.getList().get(0));
                        typeBeanFmResult.getList().remove(0);
                        RecyclerBean<TypeBean> typeBeanRecyclerBean = new RecyclerBean<TypeBean>(typeBeanFmResult.getList());
                        list.add(typeBeanRecyclerBean);
                        return list;
                    }
                }).flatMap(new Func1<List<PresentImpl>, Observable<PresentImpl>>() {
            @Override
            public Observable<PresentImpl> call(List<PresentImpl> presents) {
                return Observable.from(presents);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<PresentImpl>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        error(e);
                    }

                    @Override
                    public void onNext(PresentImpl present) {
                        Log.i(TAG, "onNext: " + present.toString());
                        showBean(present);
                        success();

                    }
                });
    }
}