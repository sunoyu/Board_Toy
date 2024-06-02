package com.suno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardContoller {

    @GetMapping("/get")
    public String getBoard(){
        return "ggg";
    }

}
