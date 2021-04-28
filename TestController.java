package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestController {
//    @RequestMapping("/hello")
//    public String hello(){
//        return "redirect:/hh";
//    }
    @RequestMapping("/hello")
    public String  testRed(@ModelAttribute("token") String token) throws Exception{
        System.out.println(token);
        return "hh";
    }
    @RequestMapping("/test")
    public String query(RedirectAttributes attr, HttpServletResponse response) throws IOException {

            attr.addFlashAttribute("token","123456");

        return "redirect:hello";

    }
}
