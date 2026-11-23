package org.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        A temp =(A) context.getBean("A_ref");
        A temp2 = (A) context.getBean("AA_ref");

        System.out.println(temp);
        System.out.println(temp2);
    }
}
