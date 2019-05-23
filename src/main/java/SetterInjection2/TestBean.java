package SetterInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansSetterInjection2.xml");
        App a = context.getBean("app",App.class);
        a.getMainService();
        a.getServices();

    }
}
