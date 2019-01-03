package com.tianpai.cwang.myandroid.contract;

import com.tianpai.cwang.myandroid.model.WxArticle;
import com.tianpai.cwang.myandroid.model.WxModel;
import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/12/26.
 */

public interface WxContract {

    interface view extends BaseView{
        void updateRecycleView(WxArticle data);
        void initTabLayout(WxModel data);
    }
    interface presenter{

        void loadData(int author,int page);
        void loadData(int author);
        void loadAuthor();

    }

}
