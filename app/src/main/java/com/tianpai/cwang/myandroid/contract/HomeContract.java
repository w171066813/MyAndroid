package com.tianpai.cwang.myandroid.contract;

import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.model.BanerModel;
import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/12/12.
 */

public interface HomeContract {

    interface view extends BaseView{

        void showBanerData(BanerModel banerModel);

        void banerDataError();

        void showRecycleViewData(ArticleModel articleModel);

        void loadMoreData(ArticleModel articleModel);


    }
    interface presenter {

        void initBanerData();

        void initRecycleData();

        void loadMoreData();

    }

}
