package com.laomao.ui.login;

import android.text.TextUtils;

/**
 * Created by laomao on 16/10/8.
 */

public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String userName, String userPwd) {

        mRxManager.add(mModel.login(userName, userPwd).subscribe(userBean -> {
            //这里可以做些操作比方数据过滤操作合并存储本地等等
            if (TextUtils.isEmpty(userBean.getToken())) {
                mView.loginFaild("登录失败!用户名或密码错误");
                return;
            }
            mRxManager.post("login", userBean);
            mView.loginSuccess();
        }, e -> {
            mView.loginFaild("登录异常!");
        }));
    }

    @Override
    public void onStart() {

    }
}
