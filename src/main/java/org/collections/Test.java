package org.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee =(Employee) context.getBean("employee1");

        System.out.println(employee);
    }
}
