package com.lenguyenbaoanh.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookStoreController {
    @GetMapping("/")
    public String redirectToHomePage() {
        return "redirect:/homepage";
    }
    @GetMapping("/homepage")
    public String hello(){
        return "homepage";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/adminlogin")
    public String adminlogin(){
        return "adminlogin";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/userinfo")
    public String userinfo(){
        return "userinfo";
    }
    @GetMapping("/author")
    public String author(){
        return "author";
    }
    @GetMapping("/book")
    public String book(){
        return "book";
    }
    @GetMapping("/bookdetail")
    public String bookdetail(){
        return "bookdetail";
    }
}
