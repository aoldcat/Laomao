package com.laomao.ui.sorts.joke;

import android.widget.Button;
import android.widget.TextView;

import com.laomao.R;
import com.laomao.base.BaseActivity;
import com.laomao.beans.bussiness.joke.JokeBean;

import java.util.List;

import butterknife.BindView;

/**
 * Created by laomao on 16/10/11.
 */

public class JokeActivity extends BaseActivity<JokePresenter,JokeModel> implements JokeContract.View{

    @BindView(R.id.btn_joke_change)
    Button btnJokeChange;
    @BindView(R.id.tv_content)
    TextView tvJoke;
    int page=1;
    @Override
    public int getLayoutId() {
        return R.layout.activity_joke;
    }

    @Override
    public void initView() {
        btnJokeChange.callOnClick();
        btnJokeChange.setOnClickListener(view -> {
            mPresenter.getJokes(page++,4);
        });

    }


    @Override
    public void getJokes(List<JokeBean.ResultBean.DataBean> jokeList) {
        String content="";
        for(JokeBean.ResultBean.DataBean dataBean :jokeList)
        {
            content+=dataBean.getContent()+"\r\n\n";
        }
        tvJoke.setText(content);
    }
}
