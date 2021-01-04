package com.its.controller;

import com.its.config.TieBaUtils;
import com.its.po.Classify;
import com.its.po.Posts;
import com.its.service.ClassifyService;
import com.its.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class PostsController {

    @Autowired
    private PostsService postsService;
    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询所有帖子方法
     */
    @RequestMapping("/findPostsList")
    public String findPostsList(ModelMap model, Integer classify_id, String info) throws UnsupportedEncodingException {
        Classify classify = new Classify();
        classify.setClassify_id(classify_id);
        //查询帖子所有数据
        List<Posts> postsList = postsService.findPostsList(classify);
        //查询当前分类实体对象，以备使用
        classify = classifyService.findClassifyById(classify);
        model.addAttribute("postsList",postsList);
        model.addAttribute("classify",classify);
        if(null != info){
            model.addAttribute("info", TieBaUtils.strDecodeAllInfo(info));
        }
        return "posts/posts_list";
    }

    /**
     * 查询帖子分类方法-去增加
     */
    @RequestMapping("/findClassifyByIdForPosts")
    public String findClassifyByIdForPosts(ModelMap model, Classify classify) throws UnsupportedEncodingException {
        classify = classifyService.findClassifyById(classify);
        model.addAttribute("classify",classify);
        return "posts/posts_add";
    }

    /**
     * 增加帖子
     */
    @RequestMapping("/addPosts")
    public String addPosts(Posts posts) throws UnsupportedEncodingException {
        int i = postsService.addPosts(posts);
        if(i > 0){
            return "redirect:findPostsList?classify_id="+posts.getClassify_id()+"&info="+ TieBaUtils.strEncodeSuccessInfo("发帖成功！");
        }else {
            return "redirect:findPostsList?classify_id="+posts.getClassify_id()+"&info="+ TieBaUtils.strEncodeErrorInfo("发帖失败，请联系管理人员！");
        }
    }

    /**
     * 根据ID查询当前对象
     */
    @RequestMapping("/findPostsById")
    public String findPostsById(ModelMap map, Posts posts,Classify classify) throws UnsupportedEncodingException {
        posts = postsService.findPostsById(posts);
        classify = classifyService.findClassifyById(classify);
        map.addAttribute("classify",classify);
        map.addAttribute("posts",posts);
        return "posts/posts_details";
    }

    /**
     * 根据ID删除帖子
     */
    @RequestMapping("/deletePosts")
    public String deletePosts(Posts posts) throws UnsupportedEncodingException {
        int i = postsService.deletePosts(posts);
        if(i > 0){
            return "redirect:findPostsList?classify_id="+posts.getClassify_id()+"&info="+ TieBaUtils.strEncodeSuccessInfo("删除成功！");
        }else {
            return "redirect:findPostsList?classify_id="+posts.getClassify_id()+"&info="+ TieBaUtils.strEncodeErrorInfo("删除失败，请联系管理人员！");
        }
    }

}
