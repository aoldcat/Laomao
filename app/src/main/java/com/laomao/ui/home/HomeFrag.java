package com.laomao.ui.home;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.andview.refreshview.XRefreshView;
import com.andview.refreshview.XRefreshViewFooter;
import com.laomao.R;
import com.laomao.base.BaseFragment;
import com.laomao.beans.bussiness.blog.BlogBean;
import com.laomao.tools.LogUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by laomao on 16/10/18.
 */

public class HomeFrag extends BaseFragment<HomeFragPresenter, HomeFragModel> implements HomeFragContract.View {

    @BindView(R.id.x_refreshview)
    XRefreshView xRefreshView;
    @BindView(R.id.recycler_blog)
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    BlogAdapter blogAdapter;
    List<BlogBean.ResultsBean> list;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
        list=new ArrayList<>();
        blogAdapter = new BlogAdapter(list);
        layoutManager = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(layoutManager);
        // 静默加载模式不能设置footerview
        recyclerView.setAdapter(blogAdapter);
        //设置刷新完成以后，headerview固定的时间
        xRefreshView.setPinnedTime(1000);
        xRefreshView.setMoveForHorizontal(true);
        xRefreshView.setPullLoadEnable(true);
        xRefreshView.setAutoLoadMore(true);
        blogAdapter.setCustomLoadMoreView(new XRefreshViewFooter(mContext));
        xRefreshView.enableReleaseToLoadMore(true);
        xRefreshView.enableRecyclerViewPullUp(true);
        xRefreshView.enablePullUpWhenLoadCompleted(true);
        xRefreshView.setXRefreshViewListener(listener);
        mPresenter.getBlogs();

    }

    XRefreshView.SimpleXRefreshListener listener = new XRefreshView.SimpleXRefreshListener() {
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
            super.onLoadMore(isSilence);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    LogUtil.showToast(mContext,"没有更多了");
                    xRefreshView.stopLoadMore();
                }
            }, 1000);
        }
    };

    @Override
    public void blogResult(BlogBean blogBean) {
        blogAdapter.blogBean=blogBean.getResults();
        blogAdapter.notifyDataSetChanged();
        xRefreshView.stopLoadMore();
    }
}
