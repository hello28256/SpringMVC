package com.yangq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author yangq
 * @version 1.0
 * @description: TODO
 * @date 2025/12/8 09:55
 */

@Controller
public class EncodingController {
    @PostMapping("/e/t1")
    public String test(Model model, String name){
        // 获取表单提交的值
        model.addAttribute("msg",name);
        // 跳转到test页面显示输入的值
        return "test";
    }
}


