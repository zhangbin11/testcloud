package com.prs.servicefeign.controller;

import com.prs.core.model.Person2;
import com.prs.core.service.HiService;
import com.prs.servicefeign.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhangbin
 * @Date: 2019-05-18 10:53
 */
@Controller
public class HiController  {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

    @RequestMapping(value = "/hi2")
    @ResponseBody
    public String sayHi2(@RequestParam String name) {

        Person p = schedualServiceHi.sayHi2FromClientOne( name );
        return p.getName();
    }

    @RequestMapping(value = "/hi3")
    @ResponseBody
    public Person2 sayHi3(@RequestParam String name) {
        return schedualServiceHi.getPerson( name );
    }
}
