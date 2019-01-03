package com.tianpai.cwang.myandroid.http.api;

import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.model.BanerModel;
import com.tianpai.cwang.myandroid.model.KnowLedgeSysModel;
import com.tianpai.cwang.myandroid.model.NaviModel;
import com.tianpai.cwang.myandroid.model.WxArticle;
import com.tianpai.cwang.myandroid.model.WxModel;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by cwang on 2018/12/11.
 */

public interface GeeksApis {

    public static final  String  HOST = "http://www.wanandroid.com/";

    /**
     * 广告栏
     * http://www.wanandroid.com/banner/json
     *
     * @return 广告栏数据
     */
    @GET("banner/json")
    Flowable<BanerModel> getBannerData();

    @GET("article/list/{num}/json")
    Observable<ArticleModel> getFeedArticleList(@Path("num") int num);


    @GET("/tree/json")
    Flowable<KnowLedgeSysModel> getKnowLedgeData();

    @GET("/wxarticle/chapters/json")
    Flowable<WxModel>  getAuthor();


    @GET("/wxarticle/list/{authorNum}/{page}/json")
    Observable<WxArticle> getWxAuthorArticle(@Path("authorNum") int code, @Path("page") int page);

    @GET("navi/json")
    Flowable<NaviModel> getNavData();
}
