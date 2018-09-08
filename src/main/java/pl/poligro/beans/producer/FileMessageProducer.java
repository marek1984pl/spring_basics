/*
 * Copyright 2018 Marek Morawiec
 * User: marek
 * Date: 07.09.2018
 * Time: 18:57
 */

package pl.poligro.beans.producer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
@Qualifier("fileMessageProducer")
public class FileMessageProducer implements MessageProducer {
    private List<String> lines = null;

    @Override
    public void printMessage() {
        System.out.println(getMessage());
    }

    @Override
    public String getMessage() {
        try {
            Path path = new File(getClass().getResource("/message.txt").toURI()).toPath();
            lines = Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

        String result = "";
        if (lines != null) {
            result = lines.stream().reduce(result, (a, b) -> a + b);
        }

        return result;
    }
}
