package com.laomao.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.laomao.R;
import com.laomao.base.BaseActivity;
import com.laomao.ui.about.AboutFrag;
import com.laomao.ui.home.HomeFrag;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import me.majiajie.pagerbottomtabstrip.Controller;
import me.majiajie.pagerbottomtabstrip.PagerBottomTabLayout;
import me.majiajie.pagerbottomtabstrip.TabItemBuilder;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectListener;

/**
 * Created by laomao on 16/10/13.
 */

public class MainTabActivity extends BaseActivity {
    @BindView(R.id.tab)
    PagerBottomTabLayout pagerBottomTabLayout;
    int[] testColors = {0xFF00796B, 0xFF5B4947, 0xFF607D8B, 0xFFF57C00, 0xFFF57C00};

    Controller controller;

    List<Fragment> mFragments;

    @Override
    public int getLayoutId() {
        return R.layout.activity_maintab;
    }

    @Override
    public void initView() {
        initFragment();
        TabItemBuilder tabItemBuilder = new TabItemBuilder(this).create()
                .setDefaultIcon(R.drawable.home_off)
                .setText(getResources().getString(R.string.tab_home))
                .setSelectedIcon(R.drawable.home_on)
                .setSelectedColor(testColors[0])
                .setTag("A")
                .build();

        controller = pagerBottomTabLayout.builder()
                .addTabItem(tabItemBuilder)
                .addTabItem(R.drawable.home_message_off, R.drawable.home_message_on, "消息", testColors[1])
                .addTabItem(R.drawable.home_me_off, R.drawable.home_me_on, "我的", testColors[1])
                .addTabItem(R.drawable.home_work_off,R.drawable.home_work_on, getResources().getString(R.string.tab_about), testColors[1])
//                .addTabItem(android.R.drawable.ic_menu_search, "小小说", testColors[2])
//                .addTabItem(android.R.drawable.ic_menu_help, "小图片", testColors[3])
//                .setMode(TabLayoutMode.HIDE_TEXT)
//                .setMode(TabLayoutMode.CHANGE_BACKGROUND_COLOR)
//                .setMode(TabLayoutMode.HIDE_TEXT | TabLayoutMode.CHANGE_BACKGROUND_COLOR)
                .build();

        controller.setMessageNumber("A", 2);
//        controller.setDisplayOval(0,true);

        controller.addTabItemClickListener(listener);
    }

    OnTabItemSelectListener listener = new OnTabItemSelectListener() {
        @Override
        public void onSelected(int index, Object tag) {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //transaction.setCustomAnimations(R.anim.push_up_in,R.anim.push_up_out);
            transaction.replace(R.id.frameLayout, mFragments.get(index));
            transaction.commit();
        }

        @Override
        public void onRepeatClick(int index, Object tag) {
        }
    };

    private void initFragment() {
        mFragments = new ArrayList<>();

        mFragments.add(new HomeFrag());
        mFragments.add(new AboutFrag());
        mFragments.add(new AboutFrag());
        mFragments.add(new AboutFrag());


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout, mFragments.get(0));
        transaction.commit();
    }


}
