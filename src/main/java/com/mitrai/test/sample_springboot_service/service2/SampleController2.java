/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrai.test.sample_springboot_service.service2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChannaJ
 */
@RestController
@RequestMapping("/api/v1/sample-controller-2")
public class SampleController2 {

    @RequestMapping(value = "/say-hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name) {
        System.out.println("[controller-2] say hi to :" + name);
        return "Hi, " + name;
    }

}
