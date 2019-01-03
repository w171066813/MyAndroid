package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tianpai.cwang.myandroid.R;

/**
 * Created by cwang on 2018/12/24.
 */

public class ReadingAdapter extends RecyclerView.Adapter<ReadingAdapter.ViewHolder> {
    private Context mContext;
    private String[] strings;
    int indexNum = -1;

    public ReadingAdapter(Context mContext, String[] strings) {
        this.mContext = mContext;
        this.strings = strings;
    }

    @Override
    public ReadingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycle_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReadingAdapter.ViewHolder holder, final int position) {
        holder.mtv.setText(strings[position]);
        if(position==indexNum){
            holder.mtv.setBackgroundResource(R.color.colorBlue);
        }else{
            holder.mtv.setBackgroundResource(R.color.colorAlla);
        }
        holder.mtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(itemClickListener!=null){
                    indexNum = position;
                    itemClickListener.onItemListener(position);
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mtv;
        public ViewHolder(View itemView) {
            super(itemView);
            mtv = itemView.findViewById(R.id.menu_title);
        }
    }


    public  interface onItemClickListener{
        void onItemListener(int position);
    }
    private onItemClickListener itemClickListener;

    public void setItemClickListener(onItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener ;
    }
}
