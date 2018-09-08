/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 17:11
 */

package pl.poligro.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.poligro.beans.printer.MessagePrinter;

public class Main {
    public static void main(String[] args) {
//        MessageProducer simpleMessageProducer = new SimpleMessageProducer();
//        simpleMessageProducer.printMessage();

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
//        MessagePrinter printer = ctx.getBean("messagePrinter", MessagePrinter.class);
//        printer.printMessage();
//        ctx.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printMessage();
        ctx.close();
    }
}
