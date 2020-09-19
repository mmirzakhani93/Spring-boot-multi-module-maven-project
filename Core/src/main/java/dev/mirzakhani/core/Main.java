package dev.mirzakhani.core;

import dev.mirzakhani.webapi.WebApiApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Scanner myObj = new Scanner(System.in);
            System.out.println("Enter 'core spring boot'");
            String coreSpringBoot = myObj.nextLine();
            if (coreSpringBoot.equals("core spring boot")) new Application();
            System.out.println("Enter 'webapi spring boot'");
            String webapiSpringBoot = myObj.nextLine();
            if (webapiSpringBoot.equals("webapi spring boot")) {
                WebApiApplication webApiApplication = new WebApiApplication();
                webApiApplication.start();
            }
    }
}

