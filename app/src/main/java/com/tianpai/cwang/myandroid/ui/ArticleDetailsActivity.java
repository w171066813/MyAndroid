package com.tianpai.cwang.myandroid.ui;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;
import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by cwang on 2018/12/17.
 */

public class ArticleDetailsActivity extends BaseActivity {


    @BindView(R.id.article_details_container)
    FrameLayout mContainer;
    @BindView(R.id.article_details_toolbar)
    Toolbar mToolbar;

    private AgentWeb mAgentWeb;


    @Override
    public void showDialog() {

    }



    @Override
    protected void onPause() {
        mAgentWeb.getWebLifeCycle().onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        mAgentWeb.getWebLifeCycle().onResume();
        super.onResume();
    }
    @Override
    public void onDestroy() {
        mAgentWeb.getWebLifeCycle().onDestroy();
        super.onDestroy();
    }


    @Override
    public void initView() {
        Intent intent = getIntent();
        String urlPath = intent.getExtras().getString("urlPath");
        String title = intent.getExtras().getString("title");
        mToolbar.setTitle(title);
        mToolbar.setNavigationIcon(R.drawable.selector_article_details_toolbar_back);
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(mContainer, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go(urlPath);
        WebView mWebView = mAgentWeb.getWebCreator().getWebView();
        WebSettings mSettings = mWebView.getSettings();
        mSettings.setJavaScriptEnabled(true);
        mSettings.setSupportZoom(true);
        mSettings.setBuiltInZoomControls(true);
        //不显示缩放按钮
        mSettings.setDisplayZoomControls(false);
        //设置自适应屏幕，两者合用
        //将图片调整到适合WebView的大小
        mSettings.setUseWideViewPort(true);
        //缩放至屏幕的大小
        mSettings.setLoadWithOverviewMode(true);
        //自适应屏幕
        mSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

    }


    private void initToolbar(){

    }

    @Override
    public int getLayout() {
        return R.layout.activity_article_details;
    }


}
