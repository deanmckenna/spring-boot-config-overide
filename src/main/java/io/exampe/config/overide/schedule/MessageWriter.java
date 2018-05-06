package io.exampe.config.overide.schedule;

import io.exampe.config.overide.configuration.Config;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageWriter {

    private final Config config;

    public MessageWriter(final Config config) {
        this.config = config;
    }

    @Scheduled(fixedRate = 5000)
    public void writeMessage() {
        System.out.println(config.getMessage());
    }
}
