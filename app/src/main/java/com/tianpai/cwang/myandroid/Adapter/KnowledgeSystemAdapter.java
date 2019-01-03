package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.KnowLedgeSysModel;

/**
 * Created by cwang on 2018/12/25.
 */

public class KnowledgeSystemAdapter extends  RecyclerView.Adapter<KnowledgeSystemAdapter.ViewHolder>  {

    Context mContext;
    KnowLedgeSysModel mData ;
    private String TAG = "KnowledgeSystemAdapter";


    public KnowledgeSystemAdapter(Context mContext, KnowLedgeSysModel mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public KnowledgeSystemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.fargment_knowledge_rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KnowledgeSystemAdapter.ViewHolder holder, int position) {
        KnowLedgeSysModel.DataBean dataBean = mData.getData().get(position);
        Log.d(TAG, "onBindViewHolder: " + dataBean.getName() );
        holder.titleTv.setText(dataBean.getName());
        StringBuffer sb  =new StringBuffer();
        int size =dataBean.getChildren().size();
        for(int i = 0;i<size;i++){
            if(i>10){
                sb.append("...");
                break;
            }
            sb.append(dataBean.getChildren().get(i).getName()+"  ");
        }
        holder.containerTv.setText(sb);

     //   holder.containerTv.setText(dataBean.getChildren().);
    }

    @Override
    public int getItemCount() {
        return mData.getData().size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv;
        TextView containerTv;
        ImageView rightIm;
        public ViewHolder(View itemView) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.title_tv);
            containerTv = itemView.findViewById(R.id.container_tv);
            rightIm = itemView.findViewById(R.id.image_im);
        }
    }
}
