package com.prs.servicefeign.controller;

import com.prs.core.model.Person2;
import com.prs.servicefeign.model.Person;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangbin
 * @Date: 2019-05-24 13:10
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public Person sayHi2FromClientOne(String name) {
        return null;
    }

    @Override
    public Person2 getPerson(String name) {
        return null;
    }
}
