package com.tianpai.cwang.myandroid.presenter;

import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/11/29.
 */

public interface BasePresenterInterface<T extends BaseView>{

        void attach(T v);

        void deachAttach();

        }

