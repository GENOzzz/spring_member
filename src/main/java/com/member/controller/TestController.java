package com.member.controller;

import com.member.dto.memberDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.member.entity.Member;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("join")
    public String join(){
        return "join";
    }

    @PostMapping("/info")
    public String createMember(memberDto form,Model model){
        model.addAttribute("member",form);
        return "info";
    }

    @GetMapping("/info/{key}")
    public String infoMember(@PathVariable Long key){

        return "/info";
    }
}
