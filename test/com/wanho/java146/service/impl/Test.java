package com.wanho.java146.service.impl;

import java.util.Date;

public class Test {
    public int f(){
        int k = 0 ;
        try {
            int i =9/0 ;
            k = 1 ;
            return  k ;
        } catch (Exception e) {
            e.printStackTrace();
            k = -1 ;
            return  k ;
        } finally {
            k = 88 ;
            System.out.println("===============");
        }
    }

    public int f2(){
        int k = 0 ;
        try {
            int i =9/0 ;
            k = 1 ;
        } catch (Exception e) {
            e.printStackTrace();
            k = -1 ;
        } finally {
            k = 88 ;
            System.out.println("===============");
        }
        return k ;
    }

    public Date f3(){
        Date date = new Date() ;
        try {
            int i =9/0 ;
            date.setYear(2000);
            return  date ;
        } catch (Exception e) {
            e.printStackTrace();
            date.setYear(1999);
            return  date ;
        } finally {
            date.setYear(1998);
            System.out.println("===============");
        }
    }

    @org.junit.Test
    public void test3(){
        Date date = f3();
        System.out.println(date.getYear());
    }

    @org.junit.Test
    public void test(){
        int f = f();
        System.out.println(f);
    }

    @org.junit.Test
    public void test2(){
        int f = f2();
        System.out.println(f);
    }

}
