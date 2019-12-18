package com.jabirdeveloper.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private ImageAuthor image;

    public Author() {
    }

    public Author(String id, String displayName, String url, ImageAuthor image) {
        this.id = id;
        this.displayName = displayName;
        this.url = url;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUrl() {
        return url;
    }

    public ImageAuthor getImage() {
        return image;
    }

    public class ImageAuthor {
        @SerializedName("url")
        @Expose
        private String url;

        public ImageAuthor() {
        }

        public ImageAuthor(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }
}
