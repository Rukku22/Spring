package collectionsettermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
    ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
    Emp emp=(Emp)con.getBean("emp1");
    System.out.println(emp.getName());
   System.out.println(emp.getPhones());
   System.out.println(emp.getCourses());System.out.println(emp.getAddress());
	}

}
