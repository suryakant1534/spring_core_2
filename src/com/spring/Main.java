package com.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beans.xml");
        var xmlBeanFactory = new XmlBeanFactory(resource);

        Student student = (Student) xmlBeanFactory.getBean("student");
        System.out.println(student);
    }
}
