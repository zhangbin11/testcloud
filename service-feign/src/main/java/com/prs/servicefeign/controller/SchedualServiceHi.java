package com.prs.servicefeign.controller;

import com.prs.core.service.HiService;
import com.prs.servicefeign.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhangbin
 * @Date: 2019-05-18 10:49
 */
@FeignClient(value = "service-hi" , fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi extends HiService {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hii")
    Person sayHi2FromClientOne(@RequestParam(value = "name") String name);


}
