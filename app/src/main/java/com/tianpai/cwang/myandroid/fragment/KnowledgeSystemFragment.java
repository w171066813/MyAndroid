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

import com.tianpai.cwang.myandroid.Adapter.KnowledgeSystemAdapter;
import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.contract.KnowledgeSystemContract;
import com.tianpai.cwang.myandroid.model.KnowLedgeSysModel;
import com.tianpai.cwang.myandroid.presenter.fragmentPresenter.KnowLedgeSysPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cwang on 2018/12/20.
 */

public class KnowledgeSystemFragment extends Fragment implements KnowledgeSystemContract.view {


    @BindView(R.id.knowledgeSys_recycle)
    RecyclerView mRecyclerView;
    Unbinder unbinder;
    KnowLedgeSysPresenter presenter;
    Context mContext;
    KnowledgeSystemAdapter knowledgeSystemAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge_system, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new KnowLedgeSysPresenter(this);
        mContext = getActivity();
        initView();
        presenter.loadData();

    }

    @Override
    public void showDialog() {

    }


    private void initView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void showData(KnowLedgeSysModel knowLedgeSysModel) {
          knowledgeSystemAdapter = new KnowledgeSystemAdapter(mContext,knowLedgeSysModel);
          mRecyclerView.setAdapter(knowledgeSystemAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.release(this);
        unbinder.unbind();
    }
}
