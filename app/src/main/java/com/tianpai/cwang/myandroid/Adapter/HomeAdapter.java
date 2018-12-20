package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.utils.LogUtils;
import com.tianpai.cwang.myandroid.widget.MaequeeText;

import java.util.ArrayList;
import java.util.List;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by cwang on 2018/12/6.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private static final int HEARER_TYPE = 0x00;
    private static final int NORMAL_TYPE = 0x01;
    private static final int PAGESIZE = 20;

    private Context mContext;
    private ArrayList<String> dataList = null;
    private LayoutInflater mInflater;
    private View mHeaderView;
    private List<ArticleModel> articleModel ;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.d(TAG, "onCreateViewHolder: " + viewType);
        if (mHeaderView != null && viewType == HEARER_TYPE) {
            return new ViewHolder(mHeaderView);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        if (getItemViewType(position) == HEARER_TYPE) {
            return ;
        } else {
            //分布加载
            int page = getPosition(position) / PAGESIZE ;
            int index = getPosition(position) % PAGESIZE ;
            ArticleModel.DataBean.DatasBean data = articleModel.get(page).getData().getDatas().get(index);
            setItemBackground(holder,getPosition(position));
            holder.authorTv.setText(data.getAuthor());
            holder.titleTv.setText(data.getTitle());
            holder.columnTv.setText(data.getChapterName());
            final String urlPath = data.getLink();
            final String title =data.getTitle();
            if (onItemClickListener != null)
            {
                holder.itemView.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        onItemClickListener.onItemClick(holder.itemView, position,urlPath,title);
                    }
                });

            }
        }

    }

    private int getPosition(int i) {
        if (mHeaderView != null) {
            return i - 1;
        }
        return i;
    }

    @Override
    public int getItemViewType(int position) {
        if (mHeaderView == null) {
            return NORMAL_TYPE;
        }
        if (position == 0) {
            return HEARER_TYPE;
        }
        return NORMAL_TYPE;
    }


    public HomeAdapter(Context mContext, List<ArticleModel> articleModel) {
        this.mContext = mContext;
        this.articleModel = articleModel;
        this.mInflater = LayoutInflater.from(mContext);
    }


    public void setHeader(View view) {
        this.mHeaderView = view;
        notifyItemInserted(0);
    }

    public void appendData(ArticleModel articleModel){
        this.articleModel.add(articleModel);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        int count = articleModel.size() * PAGESIZE;
        return mHeaderView == null ? count : count + 1;
    }




    class ViewHolder extends RecyclerView.ViewHolder {
        TextView authorTv, columnTv;
        MaequeeText titleTv;
        RelativeLayout relativeLayout ;

        public ViewHolder(View itemView) {
            super(itemView);
            authorTv = itemView.findViewById(R.id.author);
            titleTv = itemView.findViewById(R.id.title);
            columnTv = itemView.findViewById(R.id.column);
            relativeLayout = itemView.findViewById(R.id.fragment_home_rv_item_rl);
        }
    }

    private void setItemBackground(ViewHolder holder,int position){
        int index = position % 4 ;
        Log.d(TAG, "setItemBackground: "+position);
        switch (index){
            case 1:
                holder.relativeLayout.setBackground(ContextCompat.getDrawable(mContext, R.drawable.fragment_home_rv_item_bg_b));
                break;
            case 2:
                holder.relativeLayout.setBackground(ContextCompat.getDrawable(mContext, R.drawable.fragment_home_rv_item_bg_c));
                break;
            case 3:
                holder.relativeLayout.setBackground(ContextCompat.getDrawable(mContext, R.drawable.fragment_home_rv_item_bg_d));
                break;
            default:
                holder.relativeLayout.setBackground(ContextCompat.getDrawable(mContext, R.drawable.fragment_home_rv_item_bg));
                break;
        }


    }

    public interface onItemClickListener{
        void onItemClick(View view, int position,String url,String title);
    }
    private onItemClickListener onItemClickListener ;

    public void setOnItemClickLitener(onItemClickListener mOnItemClickLitener)
    {
        this.onItemClickListener = mOnItemClickLitener;
    }

}

