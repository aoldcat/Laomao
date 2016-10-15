package com.laomao.ui.login;

import android.widget.Button;
import android.widget.EditText;

import com.laomao.R;
import com.laomao.base.BaseActivity;
import com.laomao.tools.LogUtil;

import butterknife.BindView;

/**
 * Created by laomao on 16/10/8.
 */

public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View {
    @BindView(R.id.et_username)
    EditText etUserName;
    @BindView(R.id.et_userpwd)
    EditText etUserPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        btnLogin.setOnClickListener(view -> {
            String username = etUserName.getText().toString().trim();
            String pwd = etUserPwd.getText().toString().trim();
            mPresenter.login(username, pwd);
        });
    }

    @Override
    public void loginSuccess() {
        LogUtil.showToast(this, "登录成功!");
    }

    @Override
    public void loginFaild(String msg) {
        LogUtil.showToast(this, msg);
    }
}
