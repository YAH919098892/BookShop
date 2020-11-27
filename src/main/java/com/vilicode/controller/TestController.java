package com.vilicode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/1")
    public String an(){
        return "book_cart";
    }
    @RequestMapping("/2")
    public String an2(){
        return "book_detail";
    }
    @RequestMapping("/3")
    public String an3(){
        return "book_search";
    }
    @RequestMapping("/4")
    public String an4(){
        return "booktypes_list";
    }
    @RequestMapping("/5")
    public String an5(){
        return "footer";
    }
    @RequestMapping("/6")
    public String an6(){
        return "header";
    }
    @RequestMapping("/7")
    public String an7(){
        return "index";
    }
    @RequestMapping("/8")
    public String an8(){
        return "order_list";
    }
    @RequestMapping("/9")
    public String an9(){
        return "order_result";
    }
    @RequestMapping("/10")
    public String an11(){
        return "order_submit";
    }
    @RequestMapping("/11")
    public String an12(){
        return "page";
    }
    @RequestMapping("/12")
    public String an13(){
        return "recommend_list";
    }
    @RequestMapping("/13")
    public String an14(){
        return "test1";
    }
    @RequestMapping("/14")
    public String an15(){
        return "user_center";
    }


}
