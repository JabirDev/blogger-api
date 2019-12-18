package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostList {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("nextPageToken")
    @Expose
    private String nextPageToken;
    @SerializedName("prevPageToken")
    @Expose
    private String prevPageToken;
    @SerializedName("items")
    @Expose
    private List<BloggerItems> items;

    public PostList() {
    }

    public PostList(String kind, String nextPageToken, String prevPageToken, List<BloggerItems> items) {
        this.kind = kind;
        this.nextPageToken = nextPageToken;
        this.prevPageToken = prevPageToken;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }

    public List<BloggerItems> getItems() {
        return items;
    }
}
