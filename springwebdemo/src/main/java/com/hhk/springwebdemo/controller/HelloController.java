package com.hhk.springwebdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/getDataById/{id}")
    @ResponseBody
    public String getDataById(@PathVariable("id") Long id) {
        return "getDataById" + id;
    }

    @RequestMapping("/getJson/*.json")
    @ResponseBody
    public String getJson() {
        return "get json data";
    }

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    @ResponseBody
    public String getData() {
        return "RequestMethod/GET";
    }

    //处理request Content-Type为“application/json”类型的请求
    @RequestMapping(value = "/Content", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public String Consumes(@RequestBody Map<String, String> param) {
        return "Consumes POST  Content-Type=application/json";
    }
}
