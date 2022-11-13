package ewertonfelipee.github.io;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "appName")
    public String appName(){
        return "Sistemas de Vendas";
    }
}
