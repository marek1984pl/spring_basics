/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 18:47
 */

package pl.poligro.beans.decorators;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lowerCaseMessageDecorator")
public class LowerCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toLowerCase();
    }
}
