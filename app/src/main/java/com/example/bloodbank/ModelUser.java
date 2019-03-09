package com.example.bloodbank;

public class ModelUser {
    String imageUrl;
    String username;
    String bldgrp;
    String userid;

    public ModelUser() {
    }

    public ModelUser(String imageUrl,String username,String bldgrp,String userid) {
        this.bldgrp=bldgrp;
        this.username=username;
        this.imageUrl = imageUrl;
        this.userid=userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBldgrp() {
        return bldgrp;
    }

    public void setBldgrp(String bldgrp) {
        this.bldgrp = bldgrp;
    }
}
