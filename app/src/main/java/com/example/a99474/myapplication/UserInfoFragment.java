package com.example.a99474.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a99474.myapplication.entity.UserItem;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;
import com.qmuiteam.qmui.widget.textview.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 99474 on 2018/4/20.
 */

public class UserInfoFragment extends Fragment {

    List<UserItem> userItems = new ArrayList<>();
    public UserInfoFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_info_fragment,container,false);
        QMUISpanTouchFixTextView nickName = view.findViewById(R.id.nickName);
        QMUIRadiusImageView avatar = view.findViewById(R.id.avatar);
        nickName.setText("下一秒。");
        avatar.setImageResource(R.mipmap.avatar);
        initItem();
        UserItemAdapter userItemAdapter = new UserItemAdapter(getActivity(),R.layout.user_item,userItems);
        ListView userListView = view.findViewById(R.id.userListView);
        userListView.setAdapter(userItemAdapter);
        userListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    Intent intent1 = new Intent(getContext(),OperateListActivity.class);
                    startActivity(intent1);
                }else{
                    Intent intent1 = new Intent(getContext(),ProjectListActivity.class);
                    startActivity(intent1);
                }
            }
        });
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

    private void initItem(){
        UserItem operationRecord = new UserItem(R.drawable.operation_record,"操作记录",false);
        userItems.add(operationRecord);
        UserItem project = new UserItem(R.drawable.project,"我的工程",false);
        userItems.add(project);
    }

}
