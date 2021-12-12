/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; 

/**
 *
 * @author miran
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

public class HelloController {
    @RequestMapping ("/hello")
   
    public String hello(){
        return "hello spring krysta!";
    }
}



