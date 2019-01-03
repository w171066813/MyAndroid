package com.tianpai.cwang.myandroid.presenter.fragmentPresenter;

import android.util.Log;

import com.tianpai.cwang.myandroid.contract.WxContract;
import com.tianpai.cwang.myandroid.http.HttpManager;
import com.tianpai.cwang.myandroid.http.api.GeeksApis;
import com.tianpai.cwang.myandroid.model.WxArticle;
import com.tianpai.cwang.myandroid.model.WxModel;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by cwang on 2018/12/26.
 */

public class WxPresenter <T extends WxContract.view> implements WxContract.presenter {

    T view ;
    String TAG = "WxPresenter";
    private int index ;

    public WxPresenter(T view) {
        this.view = view;
    }


    public void relese(){
        if(view!=null){
            view = null;
        }
    }

    @Override
    public void loadData(int author, int page) {

    }

    @Override
    public void loadData(int author) {

        HttpManager.getInstance().create(GeeksApis.class)
                .getWxAuthorArticle(author,1).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<WxArticle>() {
            @Override
            public void onSubscribe(Disposable d) {

            }
            @Override
            public void onNext(WxArticle wxArticle) {
                Log.d(TAG, "onNext: "+wxArticle.getErrorCode());
                view.updateRecycleView(wxArticle);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        });
    }

    @Override
    public void loadAuthor() {
        HttpManager.getInstance().create(GeeksApis.class)
                .getAuthor().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<WxModel>() {
            @Override
            public void onSubscribe(Subscription s) {
                s.request(1);
            }

            @Override
            public void onNext(WxModel wxModel) {
                view.initTabLayout(wxModel);
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
