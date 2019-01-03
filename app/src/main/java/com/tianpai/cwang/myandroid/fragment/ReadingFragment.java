package com.tianpai.cwang.myandroid.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.tianpai.cwang.myandroid.Adapter.ReadingAdapter;
import com.tianpai.cwang.myandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by cwang on 2018/12/20.
 */

public class ReadingFragment extends Fragment {

    @BindView(R.id.reading_recycle)
    RecyclerView recyclerView;
    Unbinder unbinder;
    Context mContext;

    KnowledgeSystemFragment ksFragment;
    NavFragment navFragment;
    ProjectFragment projectFragment;
    WXFragment wxFragment;
    @BindView(R.id.reading_container)
    FrameLayout mContainer;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_read, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }


    private void initView() {
        mContext = getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 2);
        ReadingAdapter readingAdapter = new ReadingAdapter(mContext, initData());
        readingAdapter.setItemClickListener(new ReadingAdapter.onItemClickListener() {
            @Override
            public void onItemListener(int position) {
                Toast.makeText(mContext,"位置"+position,Toast.LENGTH_LONG).show();
                switchFragment(position);
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(readingAdapter);

        initFragment();
    }

    private void initFragment() {
        wxFragment = new WXFragment();
        navFragment = new NavFragment();
        projectFragment = new ProjectFragment();
        ksFragment = new KnowledgeSystemFragment();
        switchFragment(0);
    }


    private void switchFragment(int type) {
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        switch (type) {
            case 0:
                ft.replace(R.id.reading_container, ksFragment);
                break;
            case 1:
                ft.replace(R.id.reading_container, wxFragment);
                break;
            case 2:
                ft.replace(R.id.reading_container, navFragment);
                break;
            case 3:
                ft.replace(R.id.reading_container, projectFragment);
                break;
            default:
                break;
        }
        ft.commit();
    }


    private String[] initData() {
        Resources res = getResources();
        String[] menuReading = res.getStringArray(R.array.menu_reading);
        return menuReading;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
