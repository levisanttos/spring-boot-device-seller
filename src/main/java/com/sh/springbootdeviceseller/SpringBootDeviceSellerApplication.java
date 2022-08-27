package com.sh.springbootdeviceseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.properties.active:default}.properties")
public class SpringBootDeviceSellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeviceSellerApplication.class, args);
    }

}
