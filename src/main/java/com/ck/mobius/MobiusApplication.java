package com.ck.mobius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class MobiusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobiusApplication.class, args);
    }
}
