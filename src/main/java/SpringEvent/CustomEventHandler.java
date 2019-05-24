package SpringEvent;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Printing Event " + customEvent.toString());
    }
}
