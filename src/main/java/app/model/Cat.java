package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Meow! I am the Cat");
    }
}