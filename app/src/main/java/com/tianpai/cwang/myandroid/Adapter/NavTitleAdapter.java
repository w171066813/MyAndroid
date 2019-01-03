package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.NaviModel;

/**
 * Created by cwang on 2018/12/27.
 */

public class NavTitleAdapter extends RecyclerView.Adapter<NavTitleAdapter.ViewHolder> {

    Context mContext;
    NaviModel naviModel ;

    public NavTitleAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(NaviModel data){
        this.naviModel  = data;
        notifyDataSetChanged();
    }

    @Override
    public NavTitleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_nav_title_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NavTitleAdapter.ViewHolder holder, int position) {
        holder.textView.setText(naviModel.getData().get(position).getName());
    }

    @Override
    public int getItemCount() {
        return naviModel==null?0:naviModel.getData().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
