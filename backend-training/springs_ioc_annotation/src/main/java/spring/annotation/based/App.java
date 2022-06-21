package spring.annotation.based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);              // <bean id= "phone" class="Samsung"/>
        s7.config();
    }
}
