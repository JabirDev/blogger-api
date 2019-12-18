package com.jabirdeveloper.bloggerapi.listener;

import com.jabirdeveloper.bloggerapi.model.BloggerItems;

public interface SpecificPostListener {
    void onSpecificPostSuccessListener(BloggerItems items);
    void onFailureListener(Throwable t);
}
