package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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

public class DesignProjectFragment extends Fragment {
    private ListView mListView;
    private NodeTreeAdapter mAdapter;
    private LinkedList<Node> mLinkedList = new LinkedList<>();
    public DesignProjectFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.design_project_fragment,container,false);
        mListView = (ListView)view.findViewById(R.id.design_tree);
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
        data.add(new Dept(2, 1, "test"));
        data.add(new Dept(3, 2, "test.mcfs"));
        data.add(new Dept(4, 1, "test1"));
        data.add(new Dept(5, 4, "test.mcfs"));
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
