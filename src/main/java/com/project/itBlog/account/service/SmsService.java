package com.project.itBlog.account.service;

import com.project.itBlog.account.repository.UserMapper;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SmsService {

    @Autowired
    UserMapper userMapper;

    public void sendMessageToUser(String phone) {
        String api_key = "NCSHFID7DNBQEIEO";
        String api_secret = "KQABGFYTM0JCN5CADL3AUWCOJEEI5HJA";
        Message coolsms = new Message(api_key, api_secret);
        HashMap<String, String> params = new HashMap<String, String>();

        params.put("to", "01084164996");
        params.put("from", phone);
        params.put("type", "SMS");
        params.put("text", "가입 시 사용했던 이메일은 " + userMapper.getUserId(reformatPhoneNumber(phone)) + " 입니다.");
        params.put("app_version", "test app 1.2");

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
    }

    private String reformatPhoneNumber(String phone) {

        StringBuilder reformatPhoneNumber = new StringBuilder(phone);
        reformatPhoneNumber.insert(3, "-");
        reformatPhoneNumber.insert(8, "-");


        return reformatPhoneNumber.toString();
    }
}
