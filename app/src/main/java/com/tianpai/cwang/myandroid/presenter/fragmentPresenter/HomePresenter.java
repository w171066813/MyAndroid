package com.tianpai.cwang.myandroid.presenter.fragmentPresenter;

import android.util.Log;

import com.tianpai.cwang.myandroid.contract.HomeContract;
import com.tianpai.cwang.myandroid.contract.LoginContract;
import com.tianpai.cwang.myandroid.http.HttpManager;
import com.tianpai.cwang.myandroid.http.api.GeeksApis;
import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.model.BanerModel;
import com.tianpai.cwang.myandroid.presenter.BasePresenter;
import com.tianpai.cwang.myandroid.utils.LogUtils;
import com.tianpai.cwang.myandroid.view.BaseView;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by cwang on 2018/12/12.
 */

public class HomePresenter <T extends HomeContract.view> implements HomeContract.presenter{

    T view ;
    int mIndex = 0;

    String TAG = "HomePresenter";

    public HomePresenter(T view) {
        this.view = view;
    }

    public void release(){
        if(view!=null){
            view = null;
        }
    }


    @Override
    public void initBanerData() {
        HttpManager.getInstance().create(GeeksApis.class)
                .getBannerData().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new FlowableSubscriber<BanerModel>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                         s.request(1);
                    }
                    @Override
                    public void onNext(BanerModel banerModel) {
                         view.showBanerData(banerModel);
                    }

                    @Override
                    public void onError(Throwable t) {
                        view.banerDataError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void initRecycleData() {
        HttpManager.getInstance().create(GeeksApis.class)
                .getFeedArticleList(mIndex).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArticleModel>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        LogUtils.d("onSubscribe");
                    }

                    @Override
                    public void onNext(ArticleModel articleModel) {
                        LogUtils.d("onNext"+articleModel.getData().getSize());
                        if(mIndex==0) {
                            view.showRecycleViewData(articleModel);
                        }else {
                            view.loadMoreData(articleModel);
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        LogUtils.d("onError");
                    }

                    @Override
                    public void onComplete() {
                        LogUtils.d("onComplete");
                    }
                });
    }

    @Override
    public void loadMoreData() {
        mIndex ++;
        initRecycleData();

    }


}
