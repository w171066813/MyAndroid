package com.tianpai.cwang.myandroid.contract;

import com.tianpai.cwang.myandroid.model.KnowLedgeSysModel;
import com.tianpai.cwang.myandroid.view.BaseView;

/**
 * Created by cwang on 2018/12/25.
 */

public interface KnowledgeSystemContract {

    interface view extends BaseView{
        void showData(KnowLedgeSysModel knowLedgeSysModel);
    }

    interface presenter {
        void loadData();
    }

}
