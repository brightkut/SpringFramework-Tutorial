package Init_Destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        /*
        this code will create object by beans and run init method that we decribe in beansInit_Destroy.xml
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beansInit_Destroy.xml");
        Human h = context.getBean("h",Human.class);



        ((ClassPathXmlApplicationContext)context).close();
        ((ConfigurableApplicationContext)context).close();


    }
}
