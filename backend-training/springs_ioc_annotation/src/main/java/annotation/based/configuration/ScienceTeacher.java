package annotation.based.configuration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {

        System.out.println("this is teach method of ScienceTeacher class");

    }
}
