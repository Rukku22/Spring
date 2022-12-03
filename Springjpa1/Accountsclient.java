package com.jpa.Springjpa1;

import java.util.List;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.context.support.FileSystemXmlApplicationContext;  
  
public class Accountsclient{  
public static void main(String[] args){  
 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
 AccountDao accountsDao = context.getBean("accountsDaoBean",AccountDao.class);  
          
 accountsDao.createAccount(15, "Jai Kumar", 41000);  
 accountsDao.createAccount(20, "Rishi ", 35000);  
 System.out.println("Accounts created");  
}       
}