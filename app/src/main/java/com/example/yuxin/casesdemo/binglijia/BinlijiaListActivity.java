package com.example.yuxin.casesdemo.binglijia;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.yuxin.casesdemo.BaseActivity;
import com.example.yuxin.casesdemo.NormalTitleFragmentAdapter;
import com.example.yuxin.casesdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuXin on 2018/5/22.
 */

public class BinlijiaListActivity extends BaseActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<String> titles = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();

    private NormalTitleFragmentAdapter adapter;

    @Override
    protected int loadLayout() {
        return R.layout.activity_binlijia_list;
    }

    @Override
    protected void initData() {
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.main_color));
        tabLayout.setSelectedTabIndicatorHeight(4);
        tabLayout.setupWithViewPager(viewPager);
        titles.add("全部");
        titles.add("重要");
        titles.add("标签1");
        titles.add("标签2");
        titles.add("标签3");
        titles.add("标签4");
        titles.add("标签5");
        titles.add("标签6");
        initFragments();
        adapter = new NormalTitleFragmentAdapter(getSupportFragmentManager(),titles,fragments);
        viewPager.setAdapter(adapter);
    }


    private void initFragments() {
        for (int i = 0; i < titles.size();i++){
            fragments.add(new BinlijiaListFragment());
        }
    }// end m

    @Override
    protected void initView() {
        initTitleAndLeft("我的病历夹");
        tabLayout = (TabLayout) findViewById(R.id.tl_title);
        viewPager = (ViewPager) findViewById(R.id.vp_content);
    }// end m

}
