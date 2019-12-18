package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PagesItems {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("blog")
    @Expose
    private BloggerItems.Blog blog;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("author")
    @Expose
    private Author author;

    public PagesItems() {
    }

    public PagesItems(String kind, String id, BloggerItems.Blog blog, String published, String updated, String url, String selfLink, String title, String content, Author author) {
        this.kind = kind;
        this.id = id;
        this.blog = blog;
        this.published = published;
        this.updated = updated;
        this.url = url;
        this.selfLink = selfLink;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public BloggerItems.Blog getBlog() {
        return blog;
    }

    public String getPublished() {
        return published;
    }

    public String getUpdated() {
        return updated;
    }

    public String getUrl() {
        return url;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}
