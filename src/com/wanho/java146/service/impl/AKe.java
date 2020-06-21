package com.wanho.java146.service.impl;

import org.springframework.stereotype.Service;

@Service
public class AKe {
    /**
     * AKe.service() 连接点
     * com.wanho.java146.service.impl.AKe.service()  切面
     */
    public void service(){
        System.out.println("======AKe=====service======");
        //int k =9/0 ;
        throw new RuntimeException("xxxx") ;
    }

    public void eat(){
        System.out.println("==============AKe=====eat=============");
    }

    public String showInfo(String name,int age){
        int i  = 9/0 ;
        return "姓名："+name+",年龄:"+age ;
    }
}
