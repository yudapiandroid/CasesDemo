package com.example.yuxin.casesdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by YuXin on 2018/5/22.
 */
public class NormalTitleFragmentAdapter extends FragmentPagerAdapter {


    private List<String> title;
    private List<Fragment> fragments;

    public NormalTitleFragmentAdapter(FragmentManager fm, List<String> titles, List<Fragment> fragments) {
        super(fm);
        this.title = titles;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

}
