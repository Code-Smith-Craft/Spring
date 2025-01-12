package csc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Fruit fruit = context.getBean("Banana", Fruit.class);
        ImportFruit importFruit = new ImportFruit(fruit);
        importFruit.whatFruit();
        context.close();
    }
}
