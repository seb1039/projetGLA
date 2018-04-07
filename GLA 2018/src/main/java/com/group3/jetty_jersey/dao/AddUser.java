package com.group3.jetty_jersey.dao;

import java.util.Date;

import com.group3.jetty_jersey.entity.User;



public class AddUser {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserDao userDao = new UserDao();
        //User user = new User("mcc0", "Gilles dOr", "lolo@lolo.com");
        Date date= new Date(10,11,1666);
        //date.setYear(1999);date.setMonth(10);
        
        User user = new User("hamza111","14598h",date,"mail@mil.fr","dar","ha","m");
        
        try {
            //String username = user.getUser_name();
            String result = userDao.add(user);
            Thread.sleep(1000);
            if (result.equals("OK")) {
                System.out.println("update success");
            } else if (result.equals("CREATED")) {
                System.out.println("add success");
            }
            Thread.sleep(1000);
            System.out.println("fin=============================");
        } catch (Exception e) {
            e.toString();
        }
    }
}
