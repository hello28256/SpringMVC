package com.yangq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangq
 * @version 1.0
 * @description: TODO
 * @date 2025/12/4 15:15
 */

@Controller
public class RestFulController {

    // 原来的：http://localhost:8080/springmvc_04/add?p1=1&p2=9

    // 映射访问路径
//    @RequestMapping("/add")
//    public String index( int p1, int p2, Model model){
//
//        int result = p1+p2;
//        // Spring MVC会自动实例化一个Model对象用于向视图中传值
//        model.addAttribute("msg", "加法结果："+result);
//        // 返回视图位置
//        return "test";
//
//    }
    // 原来的：http://localhost:8080/springmvc_04/add?p1=1&p2=9
    // 现在的：http://localhost:8080/springmvc_04/add/45/66

    @RequestMapping("/add/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){

        int result = p1+p2;
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "加法结果："+result);
        // 返回视图位置
        return "test";

    }
    // 映射访问路径,必须是POST请求
    @RequestMapping(value = "/home",method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg", "My warm home!");
        return "test";
    }


}

