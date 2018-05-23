package com.example.a99474.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a99474.myapplication.R;
import com.example.a99474.myapplication.entity.ProjectItem;
import com.example.a99474.myapplication.entity.UserItem;

import java.util.List;

/**
 * Created by 99474 on 2018/4/20.
 */

public class ProjectItemAdapter extends ArrayAdapter<ProjectItem> {

    private int viewId;

    public ProjectItemAdapter(Context context, int viewId, List<ProjectItem> items) {
        super(context,viewId, items);
        this.viewId = viewId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        ProjectItem projectItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(viewId,parent,false);
        ImageView imageView = view.findViewById(R.id.project_item_image);
        TextView projectName = view.findViewById(R.id.projectName);
        TextView introduce = view.findViewById(R.id.introduce);
        TextView update_time = view.findViewById(R.id.update_time);
        imageView.setImageResource(projectItem.getImageId());
        projectName.setText(projectItem.getName());
        introduce.setText(projectItem.getIntroduce());
        update_time.setText(projectItem.getUpdateTime());
        return view;
    }

}
