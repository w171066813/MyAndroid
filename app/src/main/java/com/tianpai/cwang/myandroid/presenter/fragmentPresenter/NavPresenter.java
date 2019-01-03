package com.tianpai.cwang.myandroid.presenter.fragmentPresenter;

import com.tianpai.cwang.myandroid.contract.NavContract;
import com.tianpai.cwang.myandroid.http.HttpManager;
import com.tianpai.cwang.myandroid.http.api.GeeksApis;
import com.tianpai.cwang.myandroid.model.NaviModel;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by cwang on 2018/12/27.
 */

public class NavPresenter <T extends NavContract.view> implements NavContract.presenter {
    T view;

    public NavPresenter(T view) {
        this.view = view;
    }

    public void release(){
        if(view!=null){
            view = null;
        }
    }

    @Override
    public void loadData() {
        HttpManager.getInstance().create(GeeksApis.class)
                .getNavData().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<NaviModel>() {
            @Override
            public void onSubscribe(Subscription s) {
                s.request(1);
            }

            @Override
            public void onNext(NaviModel naviModel){
                view.showDatas(naviModel);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
