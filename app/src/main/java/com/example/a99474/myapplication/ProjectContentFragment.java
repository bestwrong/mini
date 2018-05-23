package com.example.a99474.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebStorage;
import android.widget.Button;
import android.widget.ListView;

import com.example.a99474.myapplication.entity.UserItem;
import com.qmuiteam.qmui.widget.QMUIRadiusImageView;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 99474 on 2018/4/20.
 */

public class ProjectContentFragment extends Fragment {

    private Integer displayOption = 0;
    private Button designButton = null;
    private Button originButton = null;
    public ProjectContentFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_content_fragment,container,false);
        uiInit(view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

    public void  uiInit(View view){
        designButton = view.findViewById(R.id.btn_design);
        originButton = view.findViewById(R.id.btn_origin);

        //默认加载文件树
       //根据选项加载文件树
        designButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getChildFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                DesignProjectFragment fragment1 = new DesignProjectFragment();
                transaction.add(R.id.fileContent, fragment1);
                transaction.commit();
                designButton.setBackgroundResource(R.drawable.left_bold);
                designButton.setTextColor(getResources().getColor(R.color.bg_dark_blue));
                originButton.setBackgroundResource(R.drawable.right_transparent);
                originButton.setTextColor(getResources().getColor(R.color.white));
            }
        });
        originButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getChildFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                OriginProjectFragment fragment1 = new OriginProjectFragment();
                transaction.add(R.id.fileContent, fragment1);
                transaction.commit();
                originButton.setBackgroundResource(R.drawable.right_bold);
                originButton.setTextColor(getResources().getColor(R.color.bg_dark_blue));
                designButton.setBackgroundResource(R.drawable.left_transparent);
                designButton.setTextColor(getResources().getColor(R.color.white));
            }
        });
    }

}
