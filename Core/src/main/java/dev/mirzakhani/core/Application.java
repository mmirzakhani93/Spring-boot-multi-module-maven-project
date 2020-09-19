package dev.mirzakhani.core;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class Application {

    private ConfigurableApplicationContext applicationContext;

    public Application() {

        applicationContext = new SpringApplicationBuilder().sources(Main.class)
                .web(WebApplicationType.NONE)
                .run();
    }

    public void stop() {

        applicationContext.close();
    }
}
