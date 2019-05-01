package spring.boot.integration.spring_boot_integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * the service activator
 */
@Component
@Slf4j
public class WelcomeEndpoint {

    public Message<?> get(Message<String> message) {
        String name = message.getPayload();
        log.info("Request with name = " + name);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);

        String messageStr = "Hello " + name + "! " + "Welcome to Spring Boot + Spring Integration!";
        HelloMessage returnMessage = new HelloMessage(messageStr, currentTime);

        return MessageBuilder.withPayload(returnMessage)
                .copyHeadersIfAbsent(message.getHeaders())
                .setHeader("http_statusCode", HttpStatus.OK)
                .build();
    }

}
