package io.openshift.booster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Booster {
    public static void main(String[] args) {

        SpringApplication.run(Booster.class, args);

    }

    @RequestMapping("/")
    public String home() {
        /*
         *  @TODO   FIT Training Task 1
        Modify greeting message
         */
        return "Hello World in San Diego";
    }

}
