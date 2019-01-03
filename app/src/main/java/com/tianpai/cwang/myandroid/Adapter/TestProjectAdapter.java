package com.tianpai.cwang.myandroid.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.tianpai.cwang.myandroid.R;
import com.tianpai.cwang.myandroid.model.ArticleModel;
import com.tianpai.cwang.myandroid.model.TestModelStudent;
import com.tianpai.cwang.myandroid.widget.MaequeeText;

import java.util.ArrayList;
import java.util.List;

import static android.support.constraint.Constraints.TAG;

/**
 * Created by cwang on 2019/1/2.
 */

public class TestProjectAdapter extends RecyclerView.Adapter<TestProjectAdapter.ViewHolder> {


        private static final int HEARER_TYPE = 0x00;
        private static final int NORMAL_TYPE = 0x01;
        private int normalType = 1000000;
        private int headType   = 2000000;
        private static final int PAGESIZE = 20;

        private Context mContext;
        private ArrayList<String> dataList = null;
        private LayoutInflater mInflater;
        private View mHeaderView;
        private List<TestModelStudent> articleModel ;
        private ArrayList<View> viewList = new ArrayList<>();

        @NonNull
        @Override
        public TestProjectAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            Log.d(TAG, "onCreateViewHolder: " + viewType);
            if (mHeaderView != null && viewType == HEARER_TYPE) {
                return new TestProjectAdapter.ViewHolder(mHeaderView);
            }
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home_rv_item, parent, false);
            return new TestProjectAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final TestProjectAdapter.ViewHolder holder, final int position) {

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


    public TestProjectAdapter(Context mContext, List<TestModelStudent> articleModel) {
        this.mContext = mContext;
        this.articleModel = articleModel;
        this.mInflater = LayoutInflater.from(mContext);
    }

     private void  init(){
            
     }

    public void setHeader(View view) {
        this.mHeaderView = view;
        notifyItemInserted(0);
    }

    @Override
    public int getItemCount() {
        int count = articleModel.size() * PAGESIZE;
        return mHeaderView == null ? count : count + 1;
    }




    class ViewHolder extends RecyclerView.ViewHolder {
        TextView authorTv, columnTv,updateTimeTv;
        MaequeeText titleTv;
        RelativeLayout relativeLayout ;

        public ViewHolder(View itemView) {
            super(itemView);
            authorTv = itemView.findViewById(R.id.author);
            titleTv = itemView.findViewById(R.id.title);
            columnTv = itemView.findViewById(R.id.column);
            relativeLayout = itemView.findViewById(R.id.fragment_home_rv_item_rl);
            updateTimeTv =itemView.findViewById(R.id.update_time);
        }
    }

    private void setItemBackground(TestProjectAdapter.ViewHolder holder, int position){

        holder.relativeLayout.setBackground(ContextCompat.getDrawable(mContext, R.drawable.fragment_home_rv_item_bg));

    }

    public interface onItemClickListener{
        void onItemClick(View view, int position,String url,String title);
    }
    private TestProjectAdapter.onItemClickListener onItemClickListener ;

    public void setOnItemClickLitener(TestProjectAdapter.onItemClickListener mOnItemClickLitener)
    {
        this.onItemClickListener = mOnItemClickLitener;
    }


}
