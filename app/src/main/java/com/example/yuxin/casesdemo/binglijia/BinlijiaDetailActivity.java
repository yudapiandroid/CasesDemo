package com.example.yuxin.casesdemo.binglijia;

import android.view.View;

import com.example.yuxin.casesdemo.BaseActivity;
import com.example.yuxin.casesdemo.R;

/**
 * Created by YuXin on 2018/5/22.
 */

public class BinlijiaDetailActivity extends BaseActivity {

    @Override
    protected int loadLayout() {
        return R.layout.activity_binlijia_detail;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        initTitleAndLeft("病例详情");
        getRightView().setImageResource(R.mipmap.icon_taolun);
        getRightView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
