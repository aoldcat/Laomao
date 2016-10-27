package com.laomao.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andview.refreshview.recyclerview.BaseRecyclerAdapter;
import com.laomao.R;
import com.laomao.beans.bussiness.blog.BlogBean;

import java.util.List;

/**
 * Created by laomao on 16/10/27.
 */

public class BlogAdapter extends BaseRecyclerAdapter<BlogAdapter.ViewHolder> {

    public List<BlogBean.ResultsBean> blogBean;

    public BlogAdapter(List<BlogBean.ResultsBean> blogBean) {
        this.blogBean = blogBean;
    }

    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_bolg_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, boolean isItem) {
        holder.tvBlogtitle.setText(blogBean.get(position).getTitle());
        holder.tvBlogtime.setText(blogBean.get(position).getCreatedAt());
    }

    @Override
    public int getAdapterItemCount() {
        return blogBean.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
//        @BindView(R.id.tv_blog_title)
        TextView tvBlogtitle;
//        @BindView(R.id.tv_blog_time)
        TextView tvBlogtime;

        public ViewHolder(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
            tvBlogtitle= (TextView) itemView.findViewById(R.id.tv_blog_title);
            tvBlogtime= (TextView) itemView.findViewById(R.id.tv_blog_time);
        }
    }
}
