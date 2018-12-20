package com.tianpai.cwang.myandroid.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tianpai.cwang.myandroid.Adapter.HomeAdapter;
import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.contract.HomeContract;
import com.tianpai.cwang.myandroid.contract.LoginContract;
import com.tianpai.cwang.myandroid.http.HttpManager;
import com.tianpai.cwang.myandroid.http.api.GeeksApis;
import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.model.BanerModel;
import com.tianpai.cwang.myandroid.presenter.fragmentPresenter.HomePresenter;
import com.tianpai.cwang.myandroid.ui.ArticleDetailsActivity;
import com.tianpai.cwang.myandroid.utils.GlideImageLoader;
import com.tianpai.cwang.myandroid.utils.LogUtils;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.FlowableSubscriber;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by cwang on 2018/11/30.
 */

public class HomeFragment extends Fragment implements HomeContract.view{

    @BindView(R.id.swipeRefreshlayout)
    SwipeRefreshLayout swipeRefreshLayout;
    private String TAG = "HomeFragment";
    @BindView(R.id.fragment_home_rv)
    RecyclerView fragmentHomeRv;
    private ArrayList<String> dataList;
    Context mContext;
    Unbinder unbinder;
    HomePresenter homePresenter ;
    private HomeAdapter homeAdapter;
    private Banner banner = null;
    private List<ArticleModel> models;
    private GridLayoutManager gridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: ");
        mContext = getActivity();
        initView();

    }

    @Override
    public void onStart() {
        super.onStart();
        if(banner!=null) {
            banner.startAutoPlay();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if(banner!=null) {
            banner.stopAutoPlay();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        homePresenter.release();
        unbinder.unbind();
    }

    private void initView() {
        gridLayoutManager = new GridLayoutManager(mContext, 1);
        //设置布局管理器
        fragmentHomeRv.setLayoutManager(gridLayoutManager);
        //设置为垂直布局，这也是默认的
        gridLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        homePresenter = new HomePresenter(this);
        homePresenter.initRecycleData();
        initListener();

    }


    private void setHeader(RecyclerView view) {
        View header = LayoutInflater.from(mContext).inflate(R.layout.fragment_home_banner, view, false);
        banner = header.findViewById(R.id.banner);
        homeAdapter.setHeader(header);

    }


    private void initListener(){
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                homePresenter.loadMoreData();
            }
        });

        fragmentHomeRv.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int lastPosition = gridLayoutManager.findLastVisibleItemPosition();
                LogUtils.e("LastPosition:"+lastPosition +"---------getItemCount:"+homeAdapter.getItemCount());
                if(homeAdapter.getItemCount() == lastPosition+1){
                    homePresenter.loadMoreData();
                }
            }
        });
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showBanerData(BanerModel banerModel) {
        swipeRefreshLayout.setRefreshing(false);
        final ArrayList<String> urlList = new ArrayList<>();
        final ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> descList = new ArrayList<>();
        final ArrayList<String> urlPath = new ArrayList<>();
        if(banerModel==null){
            return;
        }

        for(BanerModel.DataBean dataBean :banerModel.getData()){
            urlList.add(dataBean.getImagePath());
            titleList.add(dataBean.getTitle());
            descList.add(dataBean.getDesc());
            urlPath.add(dataBean.getUrl());

        }
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(urlList);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titleList);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用

        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                startArticleDetailsActivity(urlPath.get(position),titleList.get(position));
            }
        });

        banner.start();


    }

    @Override
    public void banerDataError() {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void showRecycleViewData(ArticleModel articleModel) {
        homePresenter.initBanerData();
        models = new ArrayList<>();
        models.add(articleModel);
        homeAdapter = new HomeAdapter(mContext, models);
        homeAdapter.setOnItemClickLitener(new HomeAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position,String urlPath,String title) {
               startArticleDetailsActivity(urlPath,title);
            }
        });
        fragmentHomeRv.setAdapter(homeAdapter);
        setHeader(fragmentHomeRv);
    }

    @Override
    public void loadMoreData(ArticleModel articleModel) {
        swipeRefreshLayout.setRefreshing(false);
        homeAdapter.appendData(articleModel);
    }


    private void startArticleDetailsActivity(String url,String title){
         Intent intent = new Intent(mContext,ArticleDetailsActivity.class);
         intent.putExtra("urlPath",url);
         intent.putExtra("title",title);
         startActivity(intent);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        homePresenter.release();
    }



    public void jumpToTop(){
        if(fragmentHomeRv!=null){
            fragmentHomeRv.scrollToPosition(0);
        }
    }
}
