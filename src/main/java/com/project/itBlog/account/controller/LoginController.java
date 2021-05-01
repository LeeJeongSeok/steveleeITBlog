package com.project.itBlog.account.controller;

import com.project.itBlog.account.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/user/login")
    public String loginUser() {
        return "/user/loginUser";
    }

    @PostMapping("/user/login")
    public String loginUser(User user) {
        return "index.jsp";
    }
}
