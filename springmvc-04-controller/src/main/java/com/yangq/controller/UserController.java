package com.yangq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangq
 * @version 1.0
 * @description: TODO
 * @date 2025/12/5 11:18
 */
@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/t1")
    public String test(String name, Model model){
        // 1.接收前端参数
        System.out.println("接收到前端的参数为:" + name);
        // 2.将返回的值传递给前端
        model.addAttribute("msg",name);
        // 3.跳转视图
        return "test";
    }
    // @RequestParam("username") : username提交的域的名称 .
    @GetMapping("/t2")
    public String hello(@RequestParam("username") String name, Model model){
        // 1.接收前端参数
        System.out.println("接收到前端的参数为:" + name);
        // 2.将返回的值传递给前端
        model.addAttribute("msg","username");
        // 3.跳转视图
        return "test";
    }
}
