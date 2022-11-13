package ewertonfelipee.github.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("appName")
    private String appName;
    @GetMapping("/hello")
    public String HelloWorld(){
        return appName;
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
