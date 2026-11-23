package org.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        A temp =(A) context.getBean("A_ref");

        System.out.println(temp);
        System.out.println(temp.getX());
        System.out.println(temp.getObject());


    }
}
