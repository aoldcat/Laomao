package com.laomao.ui.sorts.joke;

import com.laomao.tools.LogUtil;
import com.laomao.utils.SpUtil;

/**
 * Created by laomao on 16/10/11.
 */

public class JokePresenter extends JokeContract.Presenter {
    @Override
    public void getJokes(int page, int pagesize) {
        mRxManager.add(mModel.getJokes("26aa2d34d3d70760be59142fc3dcef58",page,pagesize)
        .subscribe(jokeBean -> {
            if(jokeBean.getError_code()==0)
            {
                SpUtil.setPage(page);
                mRxManager.post("getjoke",jokeBean.getResult().getData());
                mView.getJokes(jokeBean.getResult().getData());
            }
        },e->{
            LogUtil.showLog(e.getMessage());
        }));

    }

    @Override
    public void onStart() {

    }
}
