package com.wanho.java146.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aop-AspectJ.xml")
public class AKeTest2 {
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

    @Test
    public void showInfo(){
        String str = aKe.showInfo("阿珂", 18);
        System.out.println(str);
    }
}