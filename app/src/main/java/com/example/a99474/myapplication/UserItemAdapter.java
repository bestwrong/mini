package com.example.a99474.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a99474.myapplication.entity.UserItem;

import java.util.List;

/**
 * Created by 99474 on 2018/4/20.
 */

public class UserItemAdapter extends ArrayAdapter<UserItem> {

    private int viewId;

    public UserItemAdapter(Context context, int viewId, List<UserItem> items) {
        super(context,viewId, items);
        this.viewId = viewId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        UserItem userItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(viewId,parent,false);
        ImageView imageView = view.findViewById(R.id.itemImage);
        TextView textView = view.findViewById(R.id.itemText);
        imageView.setImageResource(userItem.getImageId());
        textView.setText(userItem.getName());
        return view;
    }

}
