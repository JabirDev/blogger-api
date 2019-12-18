package com.jabirdeveloper.bloggerapi.main;

import com.jabirdeveloper.bloggerapi.listener.BlogInfoListener;
import com.jabirdeveloper.bloggerapi.listener.PagesListListener;
import com.jabirdeveloper.bloggerapi.listener.PostListListener;
import com.jabirdeveloper.bloggerapi.listener.SpecificPostListener;
import com.jabirdeveloper.bloggerapi.model.BlogInfo;
import com.jabirdeveloper.bloggerapi.model.BloggerItems;
import com.jabirdeveloper.bloggerapi.model.PagesList;
import com.jabirdeveloper.bloggerapi.model.PostList;
import com.jabirdeveloper.bloggerapi.network.Koneksi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class BloggerData {

    static void getPagesListData(String url, final PagesListListener listListener){
        Call<PagesList> getPages = Koneksi.getBloggerApi().getPagesList(url);
        getPages.enqueue(new Callback<PagesList>() {
            @Override
            public void onResponse(Call<PagesList> call, Response<PagesList> response) {
                listListener.onPagesListListener(response.body());
            }

            @Override
            public void onFailure(Call<PagesList> call, Throwable t) {
                listListener.onFailureListener(t);
            }
        });
    }

    static void getBlogData(String url, final BlogInfoListener listener) {
        Call<BlogInfo> getBlog = Koneksi.getBloggerApi().getBlogInfo(url);
        getBlog.enqueue(new Callback<BlogInfo>() {
            @Override
            public void onResponse(Call<BlogInfo> call, Response<BlogInfo> response) {
                listener.onBlogInfoSuccessListener(response.body());
            }

            @Override
            public void onFailure(Call<BlogInfo> call, Throwable t) {
                listener.onFailureListener(t);
            }
        });
    }

    static void getPostListData(String url, final PostListListener listener){
        Call<PostList> getPost = Koneksi.getBloggerApi().getPostList(url);
        getPost.enqueue(new Callback<PostList>() {
            @Override
            public void onResponse(Call<PostList> call, Response<PostList> response) {
                listener.onPostListSuccessListener(response.body());
            }

            @Override
            public void onFailure(Call<PostList> call, Throwable t) {
                listener.onFailureListener(t);
            }
        });
    }

    static void getSpecificPostData(String url, final SpecificPostListener listener){
        Call<BloggerItems> getItems = Koneksi.getBloggerApi().getItems(url);
        getItems.enqueue(new Callback<BloggerItems>() {
            @Override
            public void onResponse(Call<BloggerItems> call, Response<BloggerItems> response) {
                listener.onSpecificPostSuccessListener(response.body());
            }

            @Override
            public void onFailure(Call<BloggerItems> call, Throwable t) {
                listener.onFailureListener(t);
            }
        });
    }

}
