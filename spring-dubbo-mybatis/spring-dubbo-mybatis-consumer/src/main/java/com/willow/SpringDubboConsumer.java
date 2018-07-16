package com.willow;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDubboConsumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-consumer.xml","spring-mvc.xml"});
        context.start();
       while(true){
           Thread.sleep(1000L);
       }
    }
}
