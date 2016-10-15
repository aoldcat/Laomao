package com.laomao.ui.sorts.joke;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andview.refreshview.recyclerview.BaseRecyclerAdapter;
import com.laomao.R;
import com.laomao.beans.bussiness.joke.JokeBean;

import java.util.List;

/**
 * Created by laomao on 16/10/12.
 */

public class JokeAdapter extends BaseRecyclerAdapter<JokeAdapter.ViewHolder>  {

    public List<JokeBean.ResultBean.DataBean> jokeList;

    public JokeAdapter(List<JokeBean.ResultBean.DataBean> jokeList) {
        this.jokeList = jokeList;
    }



    @Override
    public ViewHolder getViewHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_joke_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, boolean isItem) {
        holder.textView.setText(jokeList.get(position).getContent());
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();

    }

    @Override
    public <T> void insert(List<T> list, T object, int position) {
        super.insert(list, object, position);
    }

    @Override
    public int getAdapterItemCount() {
        return jokeList.size();
    }

//    @Override
//    public void onBindViewHolder(JokeAdapter.ViewHolder holder, int position) {
//        holder.textView.setText(jokeList.get(position).getContent());
//    }
//
//    @Override
//    public int getItemCount() {
//        return jokeList.size();
//    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_joke);
        }
    }
}
