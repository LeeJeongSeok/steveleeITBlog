package com.project.itBlog.account.controller;

import com.project.itBlog.account.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @GetMapping("/user/join")
    public String joinUser() {
        return "/user/joinUser";
    }

    @PostMapping("/user/join")
    public String joinUser(User user) {
        return "";
    }
}
