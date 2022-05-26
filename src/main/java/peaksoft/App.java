package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");


        System.out.println(cat == cat1);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getColor());
    }
}
