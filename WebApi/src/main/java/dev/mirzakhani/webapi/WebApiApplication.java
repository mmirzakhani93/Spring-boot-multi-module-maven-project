package dev.mirzakhani.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApiApplication {

    private ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {

        SpringApplication.run(WebApiApplication.class, args);
    }

    public void start() {

        applicationContext = new SpringApplicationBuilder().sources(WebApiApplication.class).run();
    }

    public void close() {

        applicationContext.close();
    }
}
