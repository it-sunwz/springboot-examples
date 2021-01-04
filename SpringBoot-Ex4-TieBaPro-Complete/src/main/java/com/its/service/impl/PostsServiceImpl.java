package com.its.service.impl;

import com.its.mapper.PostsMapper;
import com.its.po.Classify;
import com.its.po.Posts;
import com.its.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsMapper postsMapper;

    @Override
    public List<Posts> findPostsList(Classify classify) {
        Posts posts = new Posts();
        posts.setClassify_id(classify.getClassify_id());
        List<Posts> list = postsMapper.select(posts);
        return list;
    }

    @Override
    public int addPosts(Posts posts) {
        return postsMapper.insert(posts);
    }

    @Override
    public Posts findPostsById(Posts posts) {
        return postsMapper.selectByPrimaryKey(posts);
    }

    @Override
    public int deletePosts(Posts posts) {
        return postsMapper.deleteByPrimaryKey(posts);
    }
}
