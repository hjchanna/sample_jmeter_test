/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrai.test.sample_springboot_service.service1.model;

import java.util.Date;

/**
 *
 * @author ChannaJ
 */
public class SampleRequest {

    private String name;
    private Date birthday;

    public SampleRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
