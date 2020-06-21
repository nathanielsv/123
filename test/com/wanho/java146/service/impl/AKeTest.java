package com.wanho.java146.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AKeTest {
    @Autowired
    private AKe aKe ;
    @Test
    public void service() {
        aKe.service();
    }

    @Test
    public void eat() {
        aKe.eat();
    }
}