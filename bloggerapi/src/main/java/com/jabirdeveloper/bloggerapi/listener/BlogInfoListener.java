package com.jabirdeveloper.bloggerapi.listener;

import com.jabirdeveloper.bloggerapi.model.BlogInfo;

public interface BlogInfoListener {
    void onBlogInfoSuccessListener(BlogInfo blogInfo);
    void onFailureListener(Throwable t);
}
