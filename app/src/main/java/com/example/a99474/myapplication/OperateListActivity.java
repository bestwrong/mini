package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;

import com.example.a99474.myapplication.entity.OperateHistoryItem;
import com.example.a99474.myapplication.entity.ProjectItem;

import java.util.ArrayList;
import java.util.List;

public class OperateListActivity extends FragmentActivity {

    List<OperateHistoryItem> operateHistoryItem = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operate_history);
        uiInit();
        initItem();
        OperateHistoryItemAdapter userItemAdapter = new OperateHistoryItemAdapter(OperateListActivity.this,R.layout.operate_historty_item,operateHistoryItem);
        ListView userListView = findViewById(R.id.operateListView);
        userListView.setAdapter(userItemAdapter);
    }

    private void initItem() {
        /***
         *  从接口中获取数据并渲染列表
         **/
        OperateHistoryItem operateHistoryItem1 = new OperateHistoryItem(R.mipmap.point,"创建测试工程1","2018-5-12 18:17:10");
        OperateHistoryItem operateHistoryItem2 = new OperateHistoryItem(R.mipmap.point,"测试工程1创建测试1目录并创建测试1文件","2018-5-12 18:20:43");
        OperateHistoryItem operateHistoryItem3 = new OperateHistoryItem(R.mipmap.point,"测试工程1创建测试2目录并创建测试2文件","2018-5-12 18:21:51");
        OperateHistoryItem operateHistoryItem4 = new OperateHistoryItem(R.mipmap.point,"测试工程1编译为官方源工程","2018-5-12 18:25:15");
        OperateHistoryItem operateHistoryItem5 = new OperateHistoryItem(R.mipmap.point,"创建测试工程2","2018-5-13 08:17:41");
        OperateHistoryItem operateHistoryItem6 = new OperateHistoryItem(R.mipmap.point,"测试工程2创建测试1目录并创建测试1文件","2018-5-13 08:19:52");

        operateHistoryItem.add(operateHistoryItem1);
        operateHistoryItem.add(operateHistoryItem2);
        operateHistoryItem.add(operateHistoryItem3);
        operateHistoryItem.add(operateHistoryItem4);
        operateHistoryItem.add(operateHistoryItem5);
        operateHistoryItem.add(operateHistoryItem6);

    }

    /**
     * 界面初始化
     */
    public void uiInit(){

    }


}
