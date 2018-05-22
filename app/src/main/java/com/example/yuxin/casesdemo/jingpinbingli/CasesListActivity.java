package com.example.yuxin.casesdemo.jingpinbingli;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.yuxin.casesdemo.BaseActivity;
import com.example.yuxin.casesdemo.NormalTitleFragmentAdapter;
import com.example.yuxin.casesdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuXin on 2018/5/22.
 */
public class CasesListActivity extends BaseActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<String> titles = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();

    private NormalTitleFragmentAdapter adapter;

    @Override
    protected int loadLayout() {
        return R.layout.activity_cases_list;
    }

    @Override
    protected void initData() {
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.main_color));
        tabLayout.setSelectedTabIndicatorHeight(4);
        tabLayout.setupWithViewPager(viewPager);
        titles.add("妇科");
        titles.add("儿科");
        titles.add("骨科");
        titles.add("呼吸与胸部");
        titles.add("内分泌");
        titles.add("普通外科");
        titles.add("心血管");
        titles.add("消化内科");
        initFragments();
        adapter = new NormalTitleFragmentAdapter(getSupportFragmentManager(),titles,fragments);
        viewPager.setAdapter(adapter);

    } // end m

    private void initFragments() {
        for (int i = 0; i < titles.size();i++){
            fragments.add(new CasesListFragment());
        }
    }// end m

    @Override
    protected void initView() {
        initTitleAndLeft("精品病例");
        tabLayout = (TabLayout) findViewById(R.id.tl_title);
        viewPager = (ViewPager) findViewById(R.id.vp_content);
    } // end m

}
