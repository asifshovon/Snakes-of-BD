package com.example.snakeofbd;

public class MyPostClass {
    private String cont,loc,post,postdate,time,uemail,uname,userid,isRes, postKey;


    public MyPostClass()
    {

    }

    public MyPostClass(String cont, String loc, String post, String postdate, String time, String uemail, String uname, String userid,String isRes, String postKey) {
        this.cont = cont;
        this.loc = loc;
        this.post = post;
        this.postdate = postdate;
        this.time = time;
        this.uemail = uemail;
        this.uname = uname;
        this.userid = userid;
        this.isRes=isRes;
        this.postKey = postKey;
    }

    public String getIsRes() {
        return isRes;
    }

    public void setIsRes(String isRes) {
        this.isRes = isRes;
    }

    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
