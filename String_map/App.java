package SpringNew.String_map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Object bean = context.getBean("q3");
    	System.out.println(bean);
     }
}
