package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void release() {
        System.out.println("Timer time: " + timer.getTime());
        animal.sayHello();
    }
}