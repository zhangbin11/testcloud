package com.prs.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhangbin
 * @Date: 2019-05-18 10:09
 */
@Controller
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @ResponseBody
    public String home(@RequestParam(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
