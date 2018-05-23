package com.example.a99474.myapplication.entity;

/**
 * Created by 99474 on 2018/5/13.
 */

public class OperateHistoryItem {

    private int imageId;

    private String introduce;

    public OperateHistoryItem(int imageId, String introduce, String time) {
        this.imageId = imageId;
        this.introduce = introduce;
        this.time = time;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;
}
