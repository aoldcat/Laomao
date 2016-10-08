package com.laomao.ui.login;

import com.laomao.beans.login.UserBean;

import rx.Observable;

/**
 * Created by laomao on 16/10/8.
 */

public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<UserBean> login(String userName, String userPwd) {
        //// TODO: 16/10/8 这里应该各种网络请求、数据库、进程通信、广播等等方式拿数据 
        return null;
    }
}
