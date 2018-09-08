/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 18:38
 */

package pl.poligro.beans.decorators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upperCaseMessageDecorator")
public class UpperCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toUpperCase();
    }
}
