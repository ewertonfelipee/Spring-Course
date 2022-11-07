package ewertonfelipee.github.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
public class VendasApplication {

    @GetMapping("/hello")
    public String HelloWorld(){
        return "hello world";
    }

    @GetMapping("/ola")
    public String Ola(){
        return "Ola";
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
