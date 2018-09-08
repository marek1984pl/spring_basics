/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 17:56
 */

package pl.poligro.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.poligro.beans")
public class ApplicationConfig {

//    @Bean
//    public MessagePrinter getPrinter() {
//        MessageProducer producer = new SimpleMessageProducer();
//        return new MessagePrinter(producer);
//    }
}
