package com.tianpai.cwang.myandroid.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.base.BaseActivity;
import com.tianpai.cwang.myandroid.fragment.HomeFragment;
import com.tianpai.cwang.myandroid.fragment.MusicFragment;
import com.tianpai.cwang.myandroid.fragment.ReadingFragment;
import com.tianpai.cwang.myandroid.utils.LogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.container)
    RelativeLayout container;
    private HomeFragment homeFragment;
    private MusicFragment musicFragment;
    private ReadingFragment readingFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int type = 0;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fab.setVisibility(View.VISIBLE);
                    type = 0;
                    break;
                case R.id.navigation_music:
                    fab.setVisibility(View.INVISIBLE);
                    type = 1;
                    break;
                case R.id.navigation_reading:
                    type = 2;
                    fab.setVisibility(View.INVISIBLE);
                    break;
                default:
                    return false;
            }
            switchFragment(type);
            return true;
        }
    };

    @Override
    public void initView() {
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        homeFragment = new HomeFragment();
        musicFragment = new MusicFragment();
        readingFragment = new ReadingFragment();
        switchFragment(0);
    }

    private void switchFragment(int type) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch (type) {
            case 0:
                ft.replace(R.id.fragment, homeFragment);
                break;
            case 1:
                ft.replace(R.id.fragment, musicFragment);
                break;
            case 2:
                ft.replace(R.id.fragment, readingFragment);
                break;
            default:
                break;
        }
        ft.commit();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    public void showDialog() {

    }

    private void showGaussianBlur() {

    }


    @OnClick(R.id.fab)
    public void onViewClicked() {
        homeFragment.jumpToTop();
    }

    boolean snackBarIsShow = false ;
    @Override
    public void onBackPressed() {
        if(snackBarIsShow){
            super.onBackPressed();
        }
        snackBarIsShow = true ;
        Snackbar.make(container, "再点击一次退出", Snackbar.LENGTH_SHORT)
               .setCallback(new Snackbar.Callback() {
            @Override
            public void onDismissed(Snackbar snackbar, int event) {
                snackBarIsShow = false ;
                LogUtils.d("SnackBar :  "+"dismiss");
            }
        }).show();


    }

}
