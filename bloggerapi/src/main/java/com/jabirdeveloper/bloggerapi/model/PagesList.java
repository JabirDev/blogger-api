package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PagesList {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("items")
    @Expose
    private List<PagesItems> items;

    public PagesList() {
    }

    public PagesList(String kind, List<PagesItems> items) {
        this.kind = kind;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public List<PagesItems> getItems() {
        return items;
    }
}
