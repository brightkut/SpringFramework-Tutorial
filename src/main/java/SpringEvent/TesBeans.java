package SpringEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesBeans {
    public static void main(String[] args) {
        // like a observer pattern not sure
        ApplicationContext context = new ClassPathXmlApplicationContext("beansEvent.xml");
        Client client = (Client) context.getBean("client");
        client.publish();

    }
}
