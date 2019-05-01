package spring.boot.integration.spring_boot_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class SpringBootIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntegrationApplication.class, args);
    }

}
