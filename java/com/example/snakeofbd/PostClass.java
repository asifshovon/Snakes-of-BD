package com.example.snakeofbd;

public class PostClass {
    String uname;
    String uemail;
    String post;
    String cont;
    String loc;
    String postdate;
    String time;
    String userid;
    Long timeStamp;
    String isRes;
    String postKey;




    public PostClass(String uname, String uemail, String post, String cont, String loc, String postdate, String time, String userid, Long timeStamp,String isRes, String postKey) {
        this.uname = uname;
        this.uemail = uemail;
        this.post = post;
        this.cont = cont;
        this.loc = loc;
        this.postdate = postdate;
        this.time = time;
        this.userid = userid;
        this.timeStamp = timeStamp;
        this.isRes=isRes;
        this.postKey = postKey;
    }

    public String getIsRes() {
        return isRes;
    }

    public void setIsRes(String isRes) {
        this.isRes = isRes;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }
}
