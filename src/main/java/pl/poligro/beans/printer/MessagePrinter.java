/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 17:11
 */

package pl.poligro.beans.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.poligro.beans.decorators.MessageDecorator;
import pl.poligro.beans.producer.MessageProducer;

@Component
public class MessagePrinter {

    private MessageProducer producer;
    private MessageDecorator decorator;

    public MessagePrinter() {
    }

    @Autowired
    public MessagePrinter(@Qualifier("fileMessageProducer") MessageProducer messageProducer) {
        this.producer = messageProducer;
    }

    public MessageProducer getMessageProducer() {
        return producer;
    }

    @Autowired
    public void setMessageProducer(@Qualifier("fileMessageProducer") MessageProducer messageProducer) {
        this.producer = messageProducer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageDecorator getDecorator() {
        return decorator;
    }

    @Autowired(required = false)
    public void setDecorator(@Qualifier("upperCaseMessageDecorator") MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public void printMessage() {
        String message = producer.getMessage();
        message = decorator != null ? decorator.decorate(message) : message;
        System.out.println(message);
    }
}
