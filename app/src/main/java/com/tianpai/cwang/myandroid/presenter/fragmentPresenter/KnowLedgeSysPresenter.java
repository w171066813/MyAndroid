package com.tianpai.cwang.myandroid.presenter.fragmentPresenter;

import com.tianpai.cwang.myandroid.contract.HomeContract;
import com.tianpai.cwang.myandroid.contract.KnowledgeSystemContract;
import com.tianpai.cwang.myandroid.http.HttpManager;
import com.tianpai.cwang.myandroid.http.api.GeeksApis;
import com.tianpai.cwang.myandroid.model.BanerModel;
import com.tianpai.cwang.myandroid.model.KnowLedgeSysModel;

import org.reactivestreams.Subscription;

import io.reactivex.FlowableSubscriber;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by cwang on 2018/12/26.
 */

public class KnowLedgeSysPresenter <T extends KnowledgeSystemContract.view> implements KnowledgeSystemContract.presenter{

    T view;

    public KnowLedgeSysPresenter(T view) {
        this.view = view;
    }

    public void release(T view){
        if(view!=null){
            view = null;
        }
    }
    @Override
    public void loadData() {

        HttpManager.getInstance().create(GeeksApis.class)
                .getKnowLedgeData().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new FlowableSubscriber<KnowLedgeSysModel>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(1);
                    }
                    @Override
                    public void onNext(KnowLedgeSysModel knowLedgeSysModel) {
                       view.showData(knowLedgeSysModel);
                    }

                    @Override
                    public void onError(Throwable t)
                    {

                    }

                    @Override
                    public void onComplete() {

                    }

                });


    }
}
