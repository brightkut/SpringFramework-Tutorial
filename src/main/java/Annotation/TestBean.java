package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        //create bean without xml file use SpringCOnfig class like a xml
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Server s = context.getBean("server",Server.class);
        Client c = context.getBean("client",Client.class);


        System.out.println(s.getName());
        System.out.println(c.getAge());
        System.out.println(c.getName());

    }
}
