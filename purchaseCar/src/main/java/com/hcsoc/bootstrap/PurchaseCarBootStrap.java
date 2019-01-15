package com.hcsoc.bootstrap;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class PurchaseCarBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(PurchaseCarBootStrap.class).close();
    }

}
