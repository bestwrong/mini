package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity {

    ImageButton leftDeployButton = null;
    ImageButton rightDeployButton = null;
    ImageButton controlBarButton = null;
    ImageView tabButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 判断是否登录 从本地数据库中获取缓存 进入本页面 未登录则弹出登录界面
         * */

        uiInit();
    }

    /**
     * 界面初始化
     */
    public void uiInit(){
        leftDeployButton = findViewById(R.id.leftDeployButton); //左侧收缩按钮
        rightDeployButton = findViewById(R.id.rightDeployButton);//右侧收缩按钮
        controlBarButton = findViewById(R.id.controlBarButton);
//        tabButton = findViewById(R.id.imageView);
        //点击事件
        leftDeployButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                UserInfoFragment fragment1 = new UserInfoFragment();
                transaction.add(R.id.left_right_container, fragment1);
                transaction.commit();
                leftDeployButton.setVisibility(v.GONE);
            }
        });
        rightDeployButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                ProjectContentFragment fragment1 = new ProjectContentFragment();
                transaction.add(R.id.left_right_container, fragment1);
                transaction.commit();
                rightDeployButton.setVisibility(v.GONE);
            }
        });
        controlBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                ControlBarFragment fragment1 = new ControlBarFragment();
                transaction.add(R.id.left_right_container, fragment1);
                transaction.commit();
                controlBarButton.setVisibility(v.GONE);
            }
        });
//        tabButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager manager = getSupportFragmentManager();
//                FragmentTransaction transaction = manager.beginTransaction();
//                ControlAttributeFragment fragment1 = new ControlAttributeFragment();
//                transaction.add(R.id.left_right_container, fragment1);
//                transaction.commit();
//            }
//        });
    }


}
