package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by 99474 on 2018/4/20.
 */

public class ControlBarFragment extends Fragment {
    HorizontalListView hListView;
    HorizontalListViewAdapter hListViewAdapter;
    public ControlBarFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.control_bar_fragment,container,false);
        uiInit(view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

    public void  uiInit(View view){
        hListView = (HorizontalListView)view.findViewById(R.id.horizon_listview);
        String[] titles = {"卡片","导航条","tab栏","卡片","导航条","tab栏"};
        final int[] ids = {R.mipmap.card,R.mipmap.navigate,R.mipmap.tab,R.mipmap.card,R.mipmap.navigate,R.mipmap.tab};
        hListViewAdapter = new HorizontalListViewAdapter(view.getContext(),titles,ids);
        hListView.setAdapter(hListViewAdapter);
    }

}
