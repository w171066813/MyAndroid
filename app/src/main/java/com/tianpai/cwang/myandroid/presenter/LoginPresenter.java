package com.tianpai.cwang.myandroid.presenter;

import com.tianpai.cwang.myandroid.contract.LoginContract;
import com.tianpai.cwang.myandroid.model.BaseBody;

/**
 * Created by cwang on 2018/11/30.
 */

public class LoginPresenter<T extends LoginContract.view> implements LoginContract.presenter {

    T view ;

    public LoginPresenter(T view) {
        this.view = view;
    }
    @Override
    public void login(String name, String password) {
        BaseBody body = new BaseBody();
        if(name.equals("admin") && password.equals("admin")){
            body.setSuccess(true);
            body.setMessage("登录成功");
        }else{
            body.setSuccess(false);
            body.setMessage("登录失败");
            view.clearText();
        }
        view.loginResult(body);
    }
}
