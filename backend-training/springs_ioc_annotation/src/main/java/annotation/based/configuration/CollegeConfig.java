package annotation.based.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "annotation.based.configuration")  // if we declare the @Bean  int the method no need to @ComponentScant at the class level
public class CollegeConfig {

//    @Bean
//    public Teacher teacherBean(){
//        return new EnglishTeacher();
//    }
//
//    @Bean
//    public Principal principalBean(){
//        return new Principal();
//    }
//
//    @Bean                                        //  its we are creating method to expose the bean and this is another way to create a bean
//    public College collegeBean() {               // and this is give me back College class Object
//                                                 //the method name  //collegeBean is -- our bean id/////
//      //  College college = new College(principalBean());   // or new College(new Principal)
//
//        College college = new College();
//        college.setPrincipal(principalBean());
//        college.setTeacher(teacherBean());
//        return college;
//    }

}

