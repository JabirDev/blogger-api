package com.jabirdeveloper.bloggerapi.listener;

import com.jabirdeveloper.bloggerapi.model.PostList;

public interface PostListListener {
    void onPostListSuccessListener(PostList postList);
    void onFailureListener(Throwable t);
}
