package annotation.based.configuration;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacher implements Teacher{

    @Override
    public void teach() {

        System.out.println("this is teach method of EnglishTeacher class");
        System.out.println("teaching is good");

    }
}
