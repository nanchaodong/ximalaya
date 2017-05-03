package com.wolf.ximalaya.utils.http;

import com.wolf.ximalaya.bean.Anchor;
import com.wolf.ximalaya.bean.FmResult;
import com.wolf.ximalaya.bean.HotList;
import com.wolf.ximalaya.bean.SaleResult;
import com.wolf.ximalaya.bean.TypeBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by nanchaodong on 2017/5/2.
 */

public interface RetrofitService {

    @GET
    Observable<Anchor> getAnchorList(@Url String url, @Query("device") String device, @Query("version") String version);

    @GET
    Observable<SaleResult> getSaleList(@Url String url, @Query("channel") String channel, @Query("device") String device
            , @Query("includeActivity") String includeActivity, @Query("includeSpecial") String includeSpecial,
                                       @Query("scale") String scale, @Query("version") String version);

    @GET
    Observable<FmResult<HotList>> getHotList(@Url String url, @Query("code") String code,
                                             @Query("includeActivity") String includeActivity,
                                             @Query("includeSpecial") String includeSpecial,
                                             @Query("inreview") String inreview,
                                             @Query("scale") String scale);

    @GET
    Observable<FmResult<TypeBean>> getTypeList(@Url String url, @Query("channel") String channel,
                                               @Query("device") String device, @Query("picVersion") String picVersion,
                                               @Query("scale") String scale);
}
