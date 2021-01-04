package com.its.service.impl;

import com.its.config.TieBaUtils;
import com.its.mapper.ClassifyMapper;
import com.its.mapper.PostsMapper;
import com.its.po.Classify;
import com.its.po.Posts;
import com.its.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;
    @Autowired
    private PostsMapper postsMapper;

    @Override
    public List<Classify> findClassifyList() {
        return classifyMapper.selectAll();
    }

    @Override
    public int addClassify(Classify classify) {
        //添加日期
        classify.setClassify_create_time(TieBaUtils.dateFormat(new Date()));
        return  classifyMapper.insert(classify);
    }

    /** 删除贴吧分类 业务层处理 **/
    @Override
    public int deleteClassify(Classify classify) {
        //根据classify_id 删除posts表中的数据
        Posts posts = new Posts();
        posts.setClassify_id(classify.getClassify_id());
        //先查询帖子信息表中是否有这个分类的数据
        int count = postsMapper.selectCount(posts);
        if(count > 0){
            postsMapper.delete(posts);
        }
        //在根据classify_id 删除分类表数据
        int s = classifyMapper.delete(classify);
        return s;
    }

    @Override
    public Classify findClassifyById(Classify classify) {
        return classifyMapper.selectByPrimaryKey(classify);
    }
}
