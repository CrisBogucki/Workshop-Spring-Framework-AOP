package pl.asseco.workshop.calculationModule.Aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * Created by krzysztof.bogucki on 27 lip 2017.
 */

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* * (..))")
    public void allMethods(){}

    @Pointcut("@annotation(LoggingObject)")
    public void loggingAnnotation() {}


    @Before("loggingAnnotation()")
    public void logBefore(JoinPoint joinPoint){
        logger.info("Executing method [" + joinPoint.getSignature().getName() + "]") ;
    }

    @After("loggingAnnotation()")
    public void logAfter(JoinPoint joinPoint){
        logger.info("After method " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "loggingAnnotation()", returning = "returnedValue")
    public void logAfterReturning(Object returnedValue){
        logger.info("Returned value " + returnedValue);
    }

    @Around("loggingAnnotation()")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object methodExecutionResult = proceedingJoinPoint.proceed();

        stopWatch.stop();
        logger.info("Time execution method [" + proceedingJoinPoint.getSignature().getName() + "] : " + stopWatch.getLastTaskTimeMillis() + "ms");

        return methodExecutionResult;
    }

}
