package com.laomao.ui.sorts.joke;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.andview.refreshview.XRefreshView;
import com.andview.refreshview.XRefreshViewFooter;
import com.laomao.R;
import com.laomao.base.BaseActivity;
import com.laomao.beans.bussiness.joke.JokeBean;
import com.laomao.utils.SpUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by laomao on 16/10/11.
 */

public class JokeActivity extends BaseActivity<JokePresenter, JokeModel> implements JokeContract.View {

    @BindView(R.id.x_refreshview)
    XRefreshView xRefreshView;
    @BindView(R.id.recycler_view_test_rv)
    RecyclerView recyclerView;
    List<JokeBean.ResultBean.DataBean> jokeList;
    JokeAdapter adapter;
    LinearLayoutManager layoutManager;

    int page = 1;

    @Override
    public int getLayoutId() {
        return R.layout.activity_joke;
    }

    @Override
    public void initView() {
        page = SpUtil.getPage();
        jokeList = new ArrayList<>();
        adapter = new JokeAdapter(jokeList);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // 静默加载模式不能设置footerview
        recyclerView.setAdapter(adapter);
        //设置刷新完成以后，headerview固定的时间
        xRefreshView.setPinnedTime(1000);
        xRefreshView.setMoveForHorizontal(true);
        xRefreshView.setPullLoadEnable(true);
        xRefreshView.setAutoLoadMore(true);
        adapter.setCustomLoadMoreView(new XRefreshViewFooter(this));
        xRefreshView.enableReleaseToLoadMore(true);
        xRefreshView.enableRecyclerViewPullUp(true);
        xRefreshView.enablePullUpWhenLoadCompleted(true);

        xRefreshView.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        xRefreshView.stopRefresh();
                    }
                }, 1000);
            }

            @Override
            public void onLoadMore(boolean isSilence) {
                getJoke(5);
            }
        });
        getJoke(10);
    }


    @Override
    public void getJokes(List<JokeBean.ResultBean.DataBean> jokeList) {
        for(JokeBean.ResultBean.DataBean dataBean :jokeList)
        adapter.insert(adapter.jokeList,dataBean,adapter.getAdapterItemCount());
        xRefreshView.stopLoadMore();
    }

    private void getJoke(int pagezize)
    {
        mPresenter.getJokes(page++, pagezize);
    }
}
