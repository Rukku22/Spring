package Crudjdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main1 {

	public static void main(String[] args) {
 	    Resource resouce=new ClassPathResource("config.xml");
	    BeanFactory factory=new XmlBeanFactory(resouce);
	    
	    RegisterDao dao=(RegisterDao)factory.getBean("edao"); 
	    Register res=new Register();
	    res.setAddress("hyb");
	    res.setEmail("rus@123");
	    res.setName("ruksana");
	    res.setPhone(1234);
	    int status=dao.saveRegister(res);  
	    System.out.println(status+"successfully saved");  
	            
	}

}
