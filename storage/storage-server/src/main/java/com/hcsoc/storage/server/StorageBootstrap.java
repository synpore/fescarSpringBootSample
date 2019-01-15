package com.hcsoc.storage.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class StorageBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StorageBootstrap.class)
                .run(args);
    }
}
