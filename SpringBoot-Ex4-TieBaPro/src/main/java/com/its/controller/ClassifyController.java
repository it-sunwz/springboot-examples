package com.its.controller;

import com.its.po.Classify;
import com.its.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询所有数据
     */
    @RequestMapping("findClassifyList")
    public String findClassifyList(ModelMap model){
        List<Classify> classifyList = classifyService.findClassifyList();
        model.addAttribute("classifyList",classifyList);
        //return 返回的是classpath:/templates/目录下的html文件名
        return "classify/classify_list";
    }
}
