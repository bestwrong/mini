package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 99474 on 2018/5/11.
 */

public class OriginProjectFragment extends Fragment {
    private ListView mListView;
    private NodeTreeAdapter mAdapter;
    private LinkedList<Node> mLinkedList = new LinkedList<>();
    public OriginProjectFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.origin_project_fragment,container,false);
        mListView = (ListView)view.findViewById(R.id.origin_tree);
        mAdapter = new NodeTreeAdapter(getContext(),mListView,mLinkedList);
        mListView.setAdapter(mAdapter);
        initData();
        return view;
    }

    private void initData(){
        List<Node> data = new ArrayList<>();
        addOne(data);
        mLinkedList.addAll(NodeHelper.sortNodes(data));
        mAdapter.notifyDataSetChanged();
    }

    private void addOne(List<Node> data){
        data.add(new Dept(2, 1, "data"));
        data.add(new Dept(3, 1, "pages"));
        data.add(new Dept(4, 1, "resources"));
        data.add(new Dept(5, 1, "utils"));
        data.add(new Dept(6, 1, "app.js"));
        data.add(new Dept(7, 1, "app.json"));
        data.add(new Dept(8, 1, "app.wxss"));
        data.add(new Dept(9, 1, "project.config.json"));
        data.add(new Dept(10, 3, "test"));
        data.add(new Dept(11, 10, "test.js"));
        data.add(new Dept(12, 10, "test.json"));
        data.add(new Dept(13, 10, "test.wxss"));
        data.add(new Dept(14, 10, "test.wxml"));
        data.add(new Dept(15, 3, "test"));
        data.add(new Dept(16, 15, "test1.js"));
        data.add(new Dept(17, 15, "test1.json"));
        data.add(new Dept(18, 15, "test1.wxss"));
        data.add(new Dept(19, 15, "test1.wxml"));
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
