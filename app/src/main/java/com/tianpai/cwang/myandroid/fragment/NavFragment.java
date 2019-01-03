package com.tianpai.cwang.myandroid.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.Adapter.NavTitleAdapter;
import com.tianpai.cwang.myandroid.contract.NavContract;
import com.tianpai.cwang.myandroid.model.NaviModel;
import com.tianpai.cwang.myandroid.presenter.fragmentPresenter.NavPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cwang on 2018/12/20.
 */

public class NavFragment extends Fragment implements NavContract.view {
    Context mContext;
    Unbinder unbinder;
    NavTitleAdapter navTitleAdapter ;
    @BindView(R.id.nameRv)
    RecyclerView nameRv;
    @BindView(R.id.containerRv)
    RecyclerView containerRv;
    NavPresenter navPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity();
        initView();
    }


    private void initView(){
        LinearLayoutManager ll = new LinearLayoutManager(mContext);
        ll.setOrientation(LinearLayoutManager.VERTICAL);
        nameRv.setLayoutManager(ll);
        navTitleAdapter = new NavTitleAdapter(mContext);
        nameRv.setAdapter(navTitleAdapter);
        navPresenter = new NavPresenter(this);
        navPresenter.loadData();
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
    public void showDatas(NaviModel data) {
        navTitleAdapter.setData(data);
    }
}
