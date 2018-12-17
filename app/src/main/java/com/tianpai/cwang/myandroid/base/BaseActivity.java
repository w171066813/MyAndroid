package com.tianpai.cwang.myandroid.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tianpai.cwang.myandroid.view.BaseView;

import butterknife.ButterKnife;

/**
 * Created by cwang on 2018/11/29.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView{



    public abstract  void  initView();

    public abstract int getLayout();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        ButterKnife.bind(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
