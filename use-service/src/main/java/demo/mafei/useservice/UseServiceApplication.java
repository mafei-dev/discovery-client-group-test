package demo.mafei.useservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class UseServiceApplication {

    public static void main(String[] args) {
        System.setProperty("APP_TIMESTAMP", String.valueOf(System.currentTimeMillis()));
        SpringApplication.run(UseServiceApplication.class, args);
    }

}
