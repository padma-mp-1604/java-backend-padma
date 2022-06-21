package annotation.based.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component                 // @Component("xyz") xyz is id of  particular  bean Collage
public class College {     //if we not give the id its take default same as class name but starting from small letter  "college"


                              // @Value annotation is used to inject the value for String, int etc
    private String collegeName;  // if we use @Value annotation before method name no need to setter method

    @Required
    @Value("ramaiah")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Autowired             // it is used for inject the object
    private Principal principal;

    @Autowired
    @Qualifier("englishTeacher")
    private Teacher teacher;

//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }


//    public College(Principal principal) {             // constructor injection
//        this.principal = principal;
//    }


//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//
//        System.out.println("using setter method");
//    }

    public void test(){
        System.out.println("test method of collage class");
        System.out.println("my college name is " + collegeName);
        principal.principalInfo();
        teacher.teach();
    }
}

