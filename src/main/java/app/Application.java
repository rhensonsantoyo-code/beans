package app;

import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(app.config.AppConfig.class);
        AnimalsCage cage = context.getBean(AnimalsCage.class);
        cage.release();
    }
}