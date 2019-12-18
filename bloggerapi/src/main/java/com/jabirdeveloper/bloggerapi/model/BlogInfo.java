package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlogInfo {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
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
    @SerializedName("posts")
    @Expose
    private BlogPost posts;
    @SerializedName("pages")
    @Expose
    private BlogPages pages;
    @SerializedName("locale")
    @Expose
    private BlogLocale locale;

    public BlogInfo() {
    }

    public BlogInfo(String kind, String id, String name, String description, String published, String updated, String url, String selfLink, BlogPost posts, BlogPages pages, BlogLocale locale) {
        this.kind = kind;
        this.id = id;
        this.name = name;
        this.description = description;
        this.published = published;
        this.updated = updated;
        this.url = url;
        this.selfLink = selfLink;
        this.posts = posts;
        this.pages = pages;
        this.locale = locale;
    }

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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

    public BlogPost getPosts() {
        return posts;
    }

    public BlogPages getPages() {
        return pages;
    }

    public BlogLocale getLocale() {
        return locale;
    }

    public class BlogPost {
        @SerializedName("totalItems")
        @Expose
        private int totalItems;
        @SerializedName("selfLink")
        @Expose
        private String selfLink;

        public BlogPost() {
        }

        public BlogPost(int totalItems, String selfLink) {
            this.totalItems = totalItems;
            this.selfLink = selfLink;
        }

        public int getTotalItems() {
            return totalItems;
        }

        public String getSelfLink() {
            return selfLink;
        }

    }

    public class BlogPages {
        @SerializedName("totalItems")
        @Expose
        private int totalItems;
        @SerializedName("selfLink")
        @Expose
        private String selfLink;

        public BlogPages() {
        }

        public BlogPages(int totalItems, String selfLink) {
            this.totalItems = totalItems;
            this.selfLink = selfLink;
        }

        public int getTotalItems() {
            return totalItems;
        }

        public String getSelfLink() {
            return selfLink;
        }
    }

    public class BlogLocale {
        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("variant")
        @Expose
        private String variant;

        public BlogLocale() {
        }

        public BlogLocale(String language, String country, String variant) {
            this.language = language;
            this.country = country;
            this.variant = variant;
        }

        public String getLanguage() {
            return language;
        }

        public String getCountry() {
            return country;
        }

        public String getVariant() {
            return variant;
        }
    }
}
