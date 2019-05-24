package com.prs.servicefeign.model;

import java.io.Serializable;

/**
 * @Author: zhangbin
 * @Date: 2019-05-20 09:55
 */
public class Person implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
