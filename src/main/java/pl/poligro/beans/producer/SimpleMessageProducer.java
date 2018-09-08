/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 17:11
 */

package pl.poligro.beans.producer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("simpleMessageProducer")
public class SimpleMessageProducer implements MessageProducer{
    @Override
    public void printMessage() {
        System.out.println(getMessage());
    }

    public String getMessage() {
        return "Simple message " + System.currentTimeMillis();
    }
}
