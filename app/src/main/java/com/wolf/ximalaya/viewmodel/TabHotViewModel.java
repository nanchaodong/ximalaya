package com.wolf.ximalaya.viewmodel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.bean.FmResult;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.bean.SaleResult;
import com.wolf.ximalaya.presenter.CommonList;
import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.utils.http.RetrofitHelper;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public class TabHotViewModel extends CommonList {
    private static final String TAG = "TabHotViewModel";

    public TabHotViewModel(Context context, RecyclerView recyclerView, int spanCount, BaseRecyclerAdapter adapter) {
        super(context, recyclerView, spanCount, adapter);
    }

    @Override
    public void loadTop() {
        RetrofitHelper.getInstance().getService().getHotList("http://mobile.ximalaya.com/mobile/discovery/v1/recommend/ts-"+System.currentTimeMillis(),
                "43_210000_2102", "true", "true", "false", "1")
                .map(new Func1<FmResult<HotList>, List<PresentImpl>>() {
                    @Override
                    public List<PresentImpl> call(FmResult<HotList> hotListFmResult) {
                        List<PresentImpl> list = new ArrayList<PresentImpl>();
                        list.addAll(hotListFmResult.getList());
                        return list;
                    }
                }).flatMap(new Func1<List<PresentImpl>, Observable<PresentImpl>>() {
            @Override
            public Observable<PresentImpl> call(List<PresentImpl> presents) {
                return Observable.from(presents);
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
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
                        showBean(present);
                        Log.i(TAG, "onNext: " + present.toString());
                        success();

                    }
                });

    }
}
