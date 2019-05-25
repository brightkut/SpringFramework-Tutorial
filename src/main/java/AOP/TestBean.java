package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansAOP.xml");
        User user = (User) context.getBean("user");
        user.getName();
        user.printThrowException();
    }
}
