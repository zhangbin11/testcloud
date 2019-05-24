package com.prs.serviceribbon.controller;

import com.prs.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhangbin
 * @Date: 2019-05-18 09:45
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
