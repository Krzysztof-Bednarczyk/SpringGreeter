package exercises.spring.greet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfig {

    @Bean
    public Greeter greeter(){
        return new Greeter();
    }
}
