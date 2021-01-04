package com.its.service;

import com.its.po.Classify;
import com.its.po.Posts;

import java.util.List;

public interface PostsService {
    List<Posts> findPostsList(Classify classify);

    int addPosts(Posts posts);

    Posts findPostsById(Posts posts);

    int deletePosts(Posts posts);
}
