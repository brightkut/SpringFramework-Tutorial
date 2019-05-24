package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansAuto.xml");
        System.out.println("By Type");
        System.out.println("------------------");
        Apartment apartment = context.getBean("apart",Apartment.class);
        System.out.println(apartment.getName());


        apartment.show();

        System.out.println("By Name");
        System.out.println("-------------------");
        Apartment apartment2 = context.getBean("apart2",Apartment.class);
        System.out.println(apartment2.getName());
        apartment2.show();

    }
}
