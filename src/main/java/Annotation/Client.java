package Annotation;

import org.springframework.beans.factory.annotation.Value;

public class Client {

    @Value("boby")
    private String name;

    @Value("22")
    private  int age;


    public Client() {
    }

    public Client(String name,  int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
