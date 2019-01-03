package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.WxArticle;

/**
 * Created by cwang on 2018/12/26.
 */

public class WxAdapter extends RecyclerView.Adapter<WxAdapter.ViewHolder> {

    Context mContext;
    WxArticle wxArticle;

    public WxAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void  setData(WxArticle wxArticle){
        this.wxArticle = wxArticle;
        notifyDataSetChanged();
    }
    @Override
    public WxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_wx_rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WxAdapter.ViewHolder holder, int position) {
          String msg = wxArticle.getData().getDatas().get(position).getTitle();
          holder.textView.setText(msg);
    }

    @Override
    public int getItemCount() {
        return wxArticle == null ? 0:wxArticle.getData().getDatas().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView  textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.wx_title);
        }
    }

}
