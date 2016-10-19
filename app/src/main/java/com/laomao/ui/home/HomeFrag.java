package com.laomao.ui.home;

import android.widget.Button;
import android.widget.EditText;

import com.laomao.R;
import com.laomao.base.BaseFragment;
import com.laomao.beans.bussiness.weather.WeathersBean;
import com.laomao.tools.LogUtil;

import butterknife.BindView;

/**
 * Created by laomao on 16/10/18.
 */

public class HomeFrag extends BaseFragment<HomeFragPresenter, HomeFragModel> implements HomeFragContract.View{

    @BindView(R.id.et_cityname)
    EditText etCityname;
    @BindView(R.id.btn_weather)
    Button btnWeather;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
        btnWeather.setOnClickListener(view -> {
            mPresenter.getWeather(etCityname.getText().toString().trim());
        });
    }

    @Override
    public void weatherResult(WeathersBean.ResultBean resultBean) {

        LogUtil.showToast(getActivity(),resultBean.getData().getRealtime().getWeather().getInfo());
    }
}
