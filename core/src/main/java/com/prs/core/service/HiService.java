package com.prs.core.service;

import com.prs.core.model.Person2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhangbin
 * @Date: 2019-05-20 16:08
 */
public interface HiService {


    @RequestMapping("/hi3")
    @ResponseBody
    Person2 getPerson(@RequestParam(value = "name") String name);


}
