package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithBean {

    public static void main(String[] args) {
        // create instatnce with bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConstructorInject.xml");
        SystemManage s = context.getBean("systemmanage",SystemManage.class);
        s.showDetail();
        SystemManage s1 = context.getBean("systemmanage1",SystemManage.class);
        s1.showDetail();



        /*this is disadvantage of constructor injection because
        can't use method addclient from server how to solve is not create interface
        */
        SystemManage s2 = context.getBean("systemmanage2",SystemManage.class);
        s2.showDetail();

        ((ClassPathXmlApplicationContext) context).close();
        ((ConfigurableApplicationContext)context).close();






    }
}
