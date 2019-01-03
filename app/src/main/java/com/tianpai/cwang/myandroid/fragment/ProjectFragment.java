package com.tianpai.cwang.myandroid.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.TestModelStudent;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cwang on 2018/12/20.
 */

public class ProjectFragment extends Fragment {

    @BindView(R.id.projectRv)
    RecyclerView recyclerView;
    Unbinder unbinder;
    ArrayList<TestModelStudent> myData;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    /**
     *
     */
    private void  initData(){
        ArrayList<TestModelStudent> list = new ArrayList<>();

        myData = list;
    }
}
