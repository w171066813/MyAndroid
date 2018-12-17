package com.tianpai.cwang.myandroid.contract;

import com.tianpai.cwang.myandroid.model.BaseBody;
import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/11/29.
 */

public interface LoginContract {

    interface view extends BaseView{
        void clearText();

        void loginResult(BaseBody message);
    }

    interface presenter {
        void login(String name,String password);
    }

}
