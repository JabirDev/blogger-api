Blogger API Android Library
=========================================
[![JitPack](https://jitpack.io/v/JabirDev/blogger-api.svg)](https://jitpack.io/#JabirDev/blogger-api)

## Gradle
Add JitPack repository:
```java
repositories {
        maven { url 'https://jitpack.io' }
    }
```
And the dependency:
```java
dependencies {
    implementation 'com.github.JabirDev:blogger-api:(https://jitpack.io/#JabirDev/blogger-api)'
}
```

## Description

This library is made to make it easier for you to work with Blogger API v3.  This library also use Retrofit for the networking, you can visit Retrofit [![here](https://github.com/square/retrofit).
(Note: This library dosn't support POST request)

## Setup

* Create your `API KEY` go to [![https://developers.google.com/blogger/docs/3.0/using](Blogger API Documentation)
* Login into your Blogger account and get your blog id

## Example

```java
BloggerApi api = new BloggerApi("your_blog_id", "your_api_key");
// Get recent post
api.getPostList(new PostListListener() {
      @Override
      public void onPostListSuccessListener(PostList postList) {
            // Do something
      }

      @Override
      public void onFailureListener(Throwable t) {
             // Do something
      }
});
```
