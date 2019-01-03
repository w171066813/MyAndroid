package com.tianpai.cwang.myandroid.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianpai.cwang.myandroid.Adapter.WxAdapter;
import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.contract.WxContract;
import com.tianpai.cwang.myandroid.model.WxArticle;
import com.tianpai.cwang.myandroid.model.WxModel;
import com.tianpai.cwang.myandroid.presenter.fragmentPresenter.WxPresenter;
import com.tianpai.cwang.myandroid.utils.LogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cwang on 2018/12/20.
 */

public class WXFragment extends Fragment implements WxContract.view{

    @BindView(R.id.wxTablayout)
    TabLayout wxTablayout;
    @BindView(R.id.wxRecycleView)
    RecyclerView wxRecycleView;
    Unbinder unbinder;
    Context mContext;
    WxPresenter wxPresenter;
    WxAdapter wxAdapter ;
    String TAG = "WXFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wx, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity();
        initView();
        wxPresenter = new WxPresenter(this);
        wxPresenter.loadAuthor();
    }



    private void initView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        wxRecycleView.setLayoutManager(linearLayoutManager);
        wxAdapter = new WxAdapter(mContext);
        wxRecycleView.setAdapter(wxAdapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void updateRecycleView(WxArticle data) {
        Log.d(TAG, "updateRecycleView: "+data.getData().getDatas().size());
        wxAdapter.setData(data);
    }

    @Override
    public void initTabLayout(WxModel data) {
        int size = data.getData().size();
        for(int a = 0; a < size ; a++ ){
            String authorName = data.getData().get(a).getName();
            int code = data.getData().get(a).getId();
            wxTablayout.addTab(wxTablayout.newTab());
            wxTablayout.getTabAt(a).setText(authorName);
            wxTablayout.getTabAt(a).setTag(code);
        }
        wxTablayout.addOnTabSelectedListener(onTabSelectedListener);
        int index =(int) wxTablayout.getTabAt(0).getTag();
        wxPresenter.loadData(index);
    }



    private TabLayout.OnTabSelectedListener onTabSelectedListener = new TabLayout.OnTabSelectedListener(){
        /**
         *  @author Will
         *  @data 2018/12/26
         *  @description  onTabselected  选谁  谁中效果   UnSelected 上一个选择  ReSelected  重复选择同一个
         **/
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            LogUtils.e("tab onClick");
            LogUtils.e("tab onClick"+tab.getText());
            LogUtils.e("tab onClick"+tab.getTag());
            int authorNum = (int)tab.getTag();
            wxPresenter.loadData(authorNum);
        }
        @Override
        public void onTabUnselected(TabLayout.Tab tab) {
            LogUtils.e("onTabUnselected"+tab.getTag());
        }
        @Override
        public void onTabReselected(TabLayout.Tab tab) {
            LogUtils.e("onTabReselected"+tab.getTag());
        }
    };

}
