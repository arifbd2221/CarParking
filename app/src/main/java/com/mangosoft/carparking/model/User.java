package com.mangosoft.carparking.model;

public class User {
    String user_id;
    String username;
    String phone;
    String address;
    String imagepath;
    String gender;

    public User(String user_id, String username, String phone, String address, String imagepath, String gender) {
        this.user_id = user_id;
        this.username = username;
        this.phone = phone;
        this.address = address;
        this.imagepath = imagepath;
        this.gender = gender;
    }

}
