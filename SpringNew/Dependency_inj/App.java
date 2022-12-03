package SpringNew.Dependency_inj;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Object bean = context.getBean("employeebean");
    	System.out.println(bean);
     }
}
