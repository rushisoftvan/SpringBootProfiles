package com.learn.springbootProfiles.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class TestRunner implements CommandLineRunner {

    @Value("${my.env.code}")
    private String code;

    @Override
    public void run(String... args) throws Exception {

         System.out.println("Environmet is " + code);

    }
}
