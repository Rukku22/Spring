package com.Springhybernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
 
    	
    	ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
    	
          
        BookDao dao=(BookDao)classPathXmlApplicationContext.getBean("d");  
          
        Book e=new Book();  
        e.setId(114);  
        e.setAuthor("varun");  
        e.setBookname("CIVILS");  
          
        dao.saveBook(e);  
          
    }
}
