package com.project.itBlog.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendMailToUser(String mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail);

        message.setSubject("비밀번호 초기화를 위한 메일 전송");
        message.setText("초기화 링크 : " + "http://localhost:8080/set/password");

        javaMailSender.send(message);
    }

}
