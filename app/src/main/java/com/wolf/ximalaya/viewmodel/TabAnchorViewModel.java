package com.wolf.ximalaya.viewmodel;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.wolf.ximalaya.base.BaseRecyclerAdapter;
import com.wolf.ximalaya.bean.Anchor;
import com.wolf.ximalaya.presenter.CommonRefreshList;
import com.wolf.ximalaya.presenter.NetResponseListener;
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

public class TabAnchorViewModel extends CommonRefreshList {
    public TabAnchorViewModel(Context context, SwipeRefreshLayout refreshLayout, RecyclerView recyclerView, int spanCount, BaseRecyclerAdapter adapter) {
        super(context, refreshLayout, recyclerView, spanCount, adapter);
    }

    @Override
    public void loadTop() {
        clearRecycler();
        RetrofitHelper.getInstance().getService().getAnchorList("http://mobile.ximalaya.com/mobile/discovery/v1/anchor/recommend", "android", "5.4.99")
                .map(new Func1<Anchor, List<PresentImpl>>() {
                    @Override
                    public List<PresentImpl> call(Anchor anchor) {
                        List<PresentImpl> list = new ArrayList<PresentImpl>();
                        list.addAll(anchor.getFamous());
                        list.addAll(anchor.getNormal());
                        return list;
                    }
                }).flatMap(new Func1<List<PresentImpl>, Observable<PresentImpl>>() {
            @Override
            public Observable<PresentImpl> call(List<PresentImpl> presents) {
                return Observable.from(presents);
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<PresentImpl>() {
                    @Override
                    public void onCompleted() {
                        complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        error(e);
                    }

                    @Override
                    public void onNext(PresentImpl present) {
                        showBean(present);
                        success();
                    }
                });
    }






}
