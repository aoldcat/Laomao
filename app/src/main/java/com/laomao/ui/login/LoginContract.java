package com.laomao.ui.login;

import com.laomao.base.BaseModel;
import com.laomao.base.BasePresenter;
import com.laomao.base.BaseView;
import com.laomao.beans.login.UserBean;

import rx.Observable;

/**
 * Created by laomao on 16/10/8.
 */

public interface LoginContract {
    interface Model extends BaseModel {
        Observable<UserBean> login(String userName,String userPwd);
    }

    interface View extends BaseView {
        void loginSuccess();
        void loginFaild();
    }

    abstract class Presenter extends BasePresenter<Model,View> {
       public abstract void login(String userName,String userPwd);
    }
}
