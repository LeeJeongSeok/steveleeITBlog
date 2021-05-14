package com.project.itBlog.account.controller;

import com.project.itBlog.account.repository.UserMapper;
import com.project.itBlog.account.service.MailService;
import com.project.itBlog.account.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FindUserAccountController {

    @Autowired
    SmsService smsService;

    @Autowired
    MailService mailService;

    @Autowired
    UserMapper userMapper;

    private String id;

    @GetMapping("/find/userid")
    public String findUserId() {
        return "/user/findUserId";
    }

    @PostMapping("/find/userid")
    public String findUserId(@RequestParam("phone") String phone) {
        smsService.sendMessageToUser(phone);
        return "redirect:/user/login";
    }

    @GetMapping("/find/userpw")
    public String findUserPw() {
        return "/user/findUserPassword";
    }

    @PostMapping("/find/userpw")
    public void findUserPw(@RequestParam("id") String id) {
        this.id = id;
        mailService.sendMailToUser(id);
    }

    @GetMapping("/set/password")
    public String setNewPassword() {
        return "/user/settingNewPassword";
    }

    @PostMapping("/set/password")
    public String setNewPassword(@RequestParam("password") String newPassword) {
        userMapper.updatePassword(id, newPassword);

        return "redirect:/user/login";
    }
}
