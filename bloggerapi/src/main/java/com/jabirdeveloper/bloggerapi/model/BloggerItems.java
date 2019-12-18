package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BloggerItems {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("blog")
    @Expose
    private Blog blog;
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
    @SerializedName("replies")
    @Expose
    private Replies replies;

    public BloggerItems() {
    }

    public BloggerItems(String kind, String id, Blog blog, String published, String updated, String url, String selfLink, String title, String content, Author author, Replies replies) {
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
        this.replies = replies;
    }

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public Blog getBlog() {
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

    public Replies getReplies() {
        return replies;
    }

    public class Blog {
        @SerializedName("id")
        @Expose
        private String id;

        public Blog() {
        }

        public Blog(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

    }

    public class Replies {
        @SerializedName("totalItems")
        @Expose
        private String totalItems;
        @SerializedName("selfLink")
        @Expose
        private String selfLink;

        public Replies() {
        }

        public Replies(String totalItems, String selfLink) {
            this.totalItems = totalItems;
            this.selfLink = selfLink;
        }

        public String getTotalItems() {
            return totalItems;
        }

        public String getSelfLink() {
            return selfLink;
        }

    }
}
