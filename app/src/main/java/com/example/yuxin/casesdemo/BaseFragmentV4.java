package com.example.yuxin.casesdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by YuXin on 2018/5/22.
 */

public abstract class BaseFragmentV4 extends Fragment {

    protected View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = LayoutInflater.from(container.getContext()).inflate(loadLayout(),null);
        initView();
        initData();
        return rootView;//super.onCreateView(inflater, container, savedInstanceState);
    }


    protected View findViewById(int id){
        return rootView.findViewById(id);
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int loadLayout();




}
