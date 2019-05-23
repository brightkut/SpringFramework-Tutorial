package Autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Apartment {


    private String name;

    @Autowired
    private Car c ;

    @Autowired
    public Apartment(String name, Car c) {
        this.name = name;
        this.c = c;
    }

    public void show(){
        System.out.println(c.getName());
    }

    public String getName() {
        return name;
    }
}
