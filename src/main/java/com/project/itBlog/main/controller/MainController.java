package com.project.itBlog.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/main")
    public String blogMainDashBoardPage() {

        return "main/index.tiles";
    }
}
