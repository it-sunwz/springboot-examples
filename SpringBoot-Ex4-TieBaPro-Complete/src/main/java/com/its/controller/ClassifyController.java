package com.its.controller;

import com.its.config.TieBaUtils;
import com.its.po.Classify;
import com.its.service.ClassifyService;
import org.apache.catalina.util.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.List;

@Controller
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询所有数据
     */
    @RequestMapping("/findClassifyList")
    public String findClassifyList(ModelMap model,String info) throws UnsupportedEncodingException {
        List<Classify> classifyList = classifyService.findClassifyList();
        model.addAttribute("classifyList",classifyList);
        if(null != info){
            model.addAttribute("info", TieBaUtils.strDecodeAllInfo(info));
        }
        //return 返回的是classpath:/templates/目录下的html文件名
        return "classify/classify_list";
    }

    /**
     * 增加分类
     */
    @RequestMapping("/addClassify")
    public String addClassify(Classify classify,ModelMap model){
        int i = classifyService.addClassify(classify);
        if(i > 0){
            return "redirect:findClassifyList?info="+ TieBaUtils.strEncodeSuccessInfo("贴吧分类增加成功！");
        }else {
            return "redirect:findClassifyList?info="+ TieBaUtils.strEncodeErrorInfo("增加贴吧分类失败，请联系管理人员！");
        }
    }

    /**
     * 删除分类
     */
    @RequestMapping("/deleteClassify")
    public String deleteClassify(Classify classify){
        int i = classifyService.deleteClassify(classify);
        if(i > 0){
            return "redirect:findClassifyList?info="+ TieBaUtils.strEncodeSuccessInfo("删除分类成功！");
        }else {
            return "redirect:findClassifyList?info="+ TieBaUtils.strEncodeErrorInfo("删除贴吧分类失败，请联系管理人员！");
        }
    }
}
