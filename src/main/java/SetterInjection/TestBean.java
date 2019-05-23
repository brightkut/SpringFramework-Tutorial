package SetterInjection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansSetterInject.xml");
        Server s = context.getBean("server",Server.class);
        s.showDetail();




    }


}
