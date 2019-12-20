package com.ncu.testhttp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ljz
 * @Date 2019/12/19 20:42
 * @Version 1.0
 **/
@RestController
@RequestMapping("/sms")
public class SendController {
    @GetMapping("/send")
    public String sendMessage(@RequestParam String message){

        System.out.println("sendMessage method " + message);
        return "success";
    }
}
