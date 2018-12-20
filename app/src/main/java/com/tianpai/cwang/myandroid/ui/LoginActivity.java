package com.tianpai.cwang.myandroid.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.base.BaseActivity;
import com.tianpai.cwang.myandroid.contract.LoginContract;
import com.tianpai.cwang.myandroid.model.BaseBody;
import com.tianpai.cwang.myandroid.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by cwang on 2018/11/29.
 */

public class LoginActivity extends BaseActivity implements LoginContract.view {

    private String TAG = "Mainactivity";

    @BindView(R.id.usernamm)
    EditText usernamm;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @BindView(R.id.regist_btn)
    Button registBtn;
    @BindView(R.id.login_bg)
    RelativeLayout login_bg ;
    LoginPresenter loginPresenter;

    @Override
    public void clearText() {
        usernamm.setText("");
        password.setText("");
    }

    @Override
    public void loginResult(BaseBody message) {
        BaseBody body = message;
        if (body.isSuccess()) {
            Toast.makeText(this, body.getMessage(), Toast.LENGTH_LONG).show();
            startActivity();
        } else {
            Toast.makeText(this, body.getMessage(), Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void initView() {
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void showDialog() {

    }

    @OnClick(R.id.login_btn)
    public void onViewClicked() {
        loginPresenter.login(usernamm.getText().toString(), password.getText().toString());
    }


    @OnClick(R.id.regist_btn)
    public void registClick() {
        showGaussianBlur();
        Toast.makeText(this, "暂未开放", Toast.LENGTH_LONG).show();
    }

    private void startActivity(){
        Intent intent  = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }


    private void showGaussianBlur(){
        Bitmap inputBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.activity_login_bg );
        Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);

       //创建RenderScript，ScriptIntrinsicBlur固定写法
        RenderScript rs = RenderScript.create(this);
        ScriptIntrinsicBlur blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));

       //根据inputBitmap，outputBitmap分别分配内存
        Allocation tmpIn = Allocation.createFromBitmap(rs, inputBitmap);
        Allocation tmpOut = Allocation.createFromBitmap(rs, outputBitmap);

       //设置模糊半径取值0-25之间，不同半径得到的模糊效果不同
        blurScript.setRadius(20);
        blurScript.setInput(tmpIn);
        blurScript.forEach(tmpOut);

        //得到最终的模糊bitmap
        tmpOut.copyTo(outputBitmap);

        BitmapDrawable bg=new BitmapDrawable(outputBitmap);

        login_bg.setBackground(bg);
    }
}
