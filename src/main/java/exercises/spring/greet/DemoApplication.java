package exercises.spring.greet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GreetConfig.class);
        Greeter greeter = context.getBean(Greeter.class);
        greeter.greet();
        greeter.greet("Krzysztof");
    }
}
