package com.example.a99474.myapplication.entity;

/**
 * Created by 99474 on 2018/5/13.
 */

public class ProjectItem {

    private int imageId;

    private String name;

    private String introduce;

    private String updateTime;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectItem(int imageId, String name, String introduce, String updateTime) {
        this.imageId = imageId;
        this.name = name;
        this.introduce = introduce;
        this.updateTime = updateTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
