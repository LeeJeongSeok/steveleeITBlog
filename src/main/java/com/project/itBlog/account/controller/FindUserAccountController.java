package com.project.itBlog.account.controller;

import com.project.itBlog.account.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindUserAccountController {

    @Autowired
    SmsService smsService;

    @GetMapping("/find/userid")
    public String findUserId() {
        return "/user/findUserId";
    }

    @PostMapping("/find/userid")
    public String findUserId(@RequestParam("phone") String phone) {
        smsService.sendMessageToUser(phone);
//        smsService.test();
        System.out.println(phone);
        return "redirect:/user/login";
    }

    @GetMapping("/find/userpw")
    public String findUserPw() {
        return "/user/findUserPassword";
    }

    @PostMapping("/find/userpw")
    public void findUserPw(String userid) {

    }
}
