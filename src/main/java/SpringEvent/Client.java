package SpringEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Client implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;



    public void publish(){
        CustomEvent event = new CustomEvent(this);
        publisher.publishEvent(event);

    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;

    }
}
