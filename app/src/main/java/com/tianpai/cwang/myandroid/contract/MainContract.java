package com.tianpai.cwang.myandroid.contract;

import android.content.Context;

import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/11/30.
 */

public interface MainContract {

    interface view extends BaseView{
         void startActiviy();
    }
    interface presenter {

        void selectRecycle();

        void selectBanner();
    }


}
