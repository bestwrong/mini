package com.example.a99474.myapplication.entity;

/**
 * Created by 99474 on 2018/4/20.
 */

public class UserItem {

    private int imageId;

    private String name;

    private Boolean shot;

    public UserItem(int imageId, String name, Boolean shot) {
        this.imageId = imageId;
        this.name = name;
        this.shot = shot;
    }

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

    public Boolean getShot() {
        return shot;
    }

    public void setShot(Boolean shot) {
        this.shot = shot;
    }
}
