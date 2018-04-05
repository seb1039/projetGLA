package com.group3.jetty_jersey.dao;


public class AddUser {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserDao userDao = new UserDao();
        //User user = new User("mcc0", "Gilles dOr", "lolo@lolo.com");
        try {
            //String username = user.getUser_name();
            String result = userDao.add("hamza11","123456","15-52-1998","mail@mail.com","dardouri","hamza","male");
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
