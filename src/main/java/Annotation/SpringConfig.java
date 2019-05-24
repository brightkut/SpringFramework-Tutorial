package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Server server(){
        return new Server();
    }

    @Bean
    public Client client(){
        return new Client();
    }
}
