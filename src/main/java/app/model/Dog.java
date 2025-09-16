package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Woof! I am the Dog!");
    }
}