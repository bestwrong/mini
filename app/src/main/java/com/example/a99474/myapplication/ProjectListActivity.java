package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;

import com.example.a99474.myapplication.entity.ProjectItem;
import com.example.a99474.myapplication.entity.UserItem;

import java.util.ArrayList;
import java.util.List;

public class ProjectListActivity extends FragmentActivity {

    List<ProjectItem> projectItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_list);
        uiInit();
        initItem();
        ProjectItemAdapter userItemAdapter = new ProjectItemAdapter(ProjectListActivity.this,R.layout.project_item,projectItems);
        ListView userListView = findViewById(R.id.projectListView);
        userListView.setAdapter(userItemAdapter);
    }

    private void initItem() {
        ProjectItem projectItem1 = new ProjectItem(R.mipmap.file_fold,"第一次测试工程",
                "第一次创建的工程，包含两个测试目录文件及源工程","更新时间：2018-5-12 18:17:10");
        projectItems.add(projectItem1);
        ProjectItem projectItem2 = new ProjectItem(R.mipmap.file_fold,"第二次测试工程",
                "包含一个测试目录文件及源工程","更新时间：2018-5-13 08:17:10");
        projectItems.add(projectItem1);
    }

    /**
     * 界面初始化
     */
    public void uiInit(){

    }


}
