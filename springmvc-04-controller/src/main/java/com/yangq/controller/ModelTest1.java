package com.yangq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yangq
 * @version 1.0
 * @description: TODO
 * @date 2025/12/5 10:50
 */

@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }

    @RequestMapping("/m2/t1")
    public void test1(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        rsp.getWriter().println("Hello,Spring BY servlet API");
    }

    @RequestMapping("/m2/t2")
    public void test2(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
        rsp.sendRedirect("/index.jsp");
    }

    @RequestMapping("/m2/t3")
    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws Exception {
        // 转发
        req.setAttribute("msg","/result/t3");
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,rsp);
    }
}
