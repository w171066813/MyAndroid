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
//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                //以下代码仅为上图示例为写，具体场景中应该根据需求具体编写
//                if (position == 2) {
//                    return 2;
//                }
//                return 1;
//            }
//
//            //这个方法也很重要，但我还没搞清楚它的具体效果，从注释上来看，该方法是用于指定 item 在该行或该列上具体哪个位置，比如将GridLayoutManager设置为3行水平样式，那么第1个卡位就是在第一列的 0 位置，第2个卡位 1，一次类推。但该方法具体被调用的场景还没理清
//            @Override
//            public int getSpanIndex(int position, int spanCount) {
//                return super.getSpanIndex(position, spanCount);
//            }
//        });
////官方建议说，如果延用默认的 getSpanIndxe() 的实现逻辑的话，那么建议调用下述方法来进行优化，否则每次布局计算时会很耗性能。
//        gridLayoutManager.getSpanSizeLookup().setSpanIndexCacheEnabled(true);


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
