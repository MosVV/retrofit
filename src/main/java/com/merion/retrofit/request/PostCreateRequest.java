package com.merion.retrofit.request;

public class PostCreateRequest {
    private Integer userId;

    private String title;

    private String body;

    public Integer getUserId(int i) {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle(String create) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
