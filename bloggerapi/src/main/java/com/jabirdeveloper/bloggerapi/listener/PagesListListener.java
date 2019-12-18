package com.jabirdeveloper.bloggerapi.listener;

import com.jabirdeveloper.bloggerapi.model.PagesList;

public interface PagesListListener {
    void onPagesListListener(PagesList pagesList);
    void onFailureListener(Throwable t);
}
