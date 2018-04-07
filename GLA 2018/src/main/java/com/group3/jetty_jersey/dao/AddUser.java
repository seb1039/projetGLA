package com.group3.jetty_jersey.dao;

import java.util.Date;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;

import com.group3.jetty_jersey.entity.User;



public class AddUser {
    public static void main(String[] args) {
    	String result="";
        // TODO Auto-generated method stub
        UserDao userDao = new UserDao();
        //User user = new User("mcc0", "Gilles dOr", "lolo@lolo.com");
        Date date= new Date(10,11,1666);
        //date.setYear(1999);date.setMonth(10);
        User [] user = new User[10];
        for(int i =0;i<10;i++)
         user[i] = new User("hamza111","14598h",date,"mail@mil.fr","dar","ha","m");
       
        
        try {
            //String username = user.getUser_name();
        	 for(int i =0;i<10;i++) {
             result = userDao.add(user[i]);
        	 String get = userDao.getByID(user[i]);
        	 System.out.println(get);
        	 }
        	 String del = userDao.delete(user[5]);
        	 String del2 = userDao.delete(user[9]);
        	 userDao.update("0", "lastName", "Bryan");
        	 System.out.println("update : ");
        	 System.out.println(userDao.getByID(user[0]));
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
