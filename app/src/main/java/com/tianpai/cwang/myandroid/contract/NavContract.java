package com.tianpai.cwang.myandroid.contract;

import com.tianpai.cwang.myandroid.model.NaviModel;
import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/12/27.
 */

public interface NavContract {
    interface view extends BaseView{
        void showDatas(NaviModel data);
    }
    interface presenter {
        void loadData();
    }
}
