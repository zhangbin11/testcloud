package com.prs.servicehi.controller;

import com.prs.core.model.Person2;
import com.prs.core.service.HiService;
import com.prs.servicehi.model.Person;
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
public class HiController implements HiService {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @ResponseBody
    public String home(@RequestParam(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


    @RequestMapping("/hii")
    @ResponseBody
    public Person hi2(@RequestParam(value = "name") String name) {
        Person p = new Person();
        p.setName(name);
        return p;
    }

    @RequestMapping("/hi3")
    @ResponseBody
    @Override
    public Person2 getPerson(String name) {
        Person2 p = new Person2();
        p.setName(name);
        return p;
    }
}
