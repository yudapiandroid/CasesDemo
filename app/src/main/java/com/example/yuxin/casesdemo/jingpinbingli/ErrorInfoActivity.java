package com.example.yuxin.casesdemo.jingpinbingli;

import com.example.yuxin.casesdemo.BaseActivity;
import com.example.yuxin.casesdemo.R;

/**
 * Created by YuXin on 2018/5/22.
 */

public class ErrorInfoActivity extends BaseActivity {
    @Override
    protected int loadLayout() {
        return R.layout.activity_error_info;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        initTitleAndLeft("纠错");
        getRightView().setImageResource(R.mipmap.icon_tijiao);
    }
}
