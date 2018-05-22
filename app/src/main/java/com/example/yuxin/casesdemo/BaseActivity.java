package com.example.yuxin.casesdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by YuXin on 2018/5/22.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(loadLayout());
    }

    protected abstract int loadLayout();

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    public void initTitleAndLeft(String title){
        View left = getWindow().getDecorView().findViewById(R.id.iv_left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView titleView = (TextView) getWindow().getDecorView().findViewById(R.id.tv_title);
        titleView.setText(title);
    } // end m


    public ImageView getRightView(){
        return (ImageView) getWindow().getDecorView().findViewById(R.id.iv_right);
    }

    public static void startActivity(Class clazz, Context context){
        Intent intent = new Intent();
        intent.setClass(context,clazz);
        context.startActivity(intent);
    }

}
