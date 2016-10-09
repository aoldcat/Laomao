package com.laomao.ui.login;

import com.laomao.base.RxSchedulers;
import com.laomao.beans.login.UserBean;

import rx.Observable;

/**
 * Created by laomao on 16/10/8.
 */

public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<UserBean> login(String userName, String userPwd) {
        //// TODO: 16/10/8 这里应该各种网络请求、数据库、进程通信、广播等等方式拿数据
        UserBean user;
        if ("1".equals(userName) && "1".equals(userPwd)) {
            user= new UserBean();
            user.setName("laomao");
            user.setId("0001");
            user.setAge(18);
            user.setToken("1234");

        }
        else {
            user=new UserBean();
            user.setName("");
            user.setId("");
            user.setAge(0);
            user.setToken("");
        }
        return Observable.just(user).compose(RxSchedulers.ioMain());
    }
}
