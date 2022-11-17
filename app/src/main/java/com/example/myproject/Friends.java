package com.example.myproject;

public class Friends {

    String friendname;
    int img;

    public Friends(String friendname, int img){

        this.friendname=friendname;
        this.img=img;

    }

    public String getFriendname() {
        return friendname;
    }

    public int getImg() {
        return img;
    }

    public void setFriendname(String friendname) {
        this.friendname = friendname;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "friendname='" + friendname + '\'' +
                ", img=" + img +
                '}';
    }
}
