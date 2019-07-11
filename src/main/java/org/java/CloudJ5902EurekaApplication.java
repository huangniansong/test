package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudJ5902EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudJ5902EurekaApplication.class, args);
    }

}
