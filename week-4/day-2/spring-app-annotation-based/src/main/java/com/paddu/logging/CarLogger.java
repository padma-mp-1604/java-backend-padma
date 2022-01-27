package com.paddu.logging;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarLogger {

    //execution(public String com.ani.car.Car.speedUp())
    //execution(* com.paddu.car.*.*(..))

    @Pointcut("execution(public * com.paddu.car.Car.speedUp(..))")
    public void pointCutAfterExecution() { }

    @Before("execution(* com.paddu.car.*.*(..))")
    public void logBeforeAnyMethodExecutionCarPackage(JoinPoint jp) {
        System.out.println("Before Execution I am getting printed");
        System.out.println("Executing method "+jp.getSignature());
        System.out.println("After this line you will see method output");
        System.out.println("----------------");
    }

    @After("pointCutAfterExecution()")
    public void logAfterAnyMethods(JoinPoint jp) {
        System.out.println("After Execution I am getting printed");
    }
}

//   OUTPUT
//    Before Execution I am getting printed
//    Executing method void com.paddu.car.Bmw.openWindow()
//        After this line you will see method output
//        ----------------
//        Opening Windows
//        org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//        org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//        org.springframework.context.event.internalEventListenerProcessor
//        org.springframework.context.event.internalEventListenerFactory
//        appConfig
//        bmw
//        car
//        driver
//        carLogger
//        tempo
//        org.springframework.aop.config.internalAutoProxyCreator
//
//        Process finished with exit code 0