package com.example.a99474.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a99474.myapplication.entity.OperateHistoryItem;
import com.example.a99474.myapplication.entity.UserItem;

import java.util.List;

/**
 * Created by 99474 on 2018/4/20.
 */

public class OperateHistoryItemAdapter extends ArrayAdapter<OperateHistoryItem> {

    private int viewId;

    public OperateHistoryItemAdapter(Context context, int viewId, List<OperateHistoryItem> items) {
        super(context,viewId, items);
        this.viewId = viewId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        OperateHistoryItem operateHistoryItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(viewId,parent,false);
        ImageView imageView = view.findViewById(R.id.op_item_image);
        TextView introduce = view.findViewById(R.id.op_introduce);
        TextView createTime = view.findViewById(R.id.op_time);
        imageView.setImageResource(operateHistoryItem.getImageId());
        introduce.setText(operateHistoryItem.getIntroduce());
        createTime.setText(operateHistoryItem.getTime());
        return view;
    }

}
