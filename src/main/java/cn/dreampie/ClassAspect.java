package cn.dreampie;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.lang.reflect.Method;

/**
 * @author Dreampie
 * @date 2015-06-16
 * @what
 */
@Aspect
public class ClassAspect {

//  @Pointcut(" set(!static !final !transient * (@cn.dreampie.ClassAnn *).*")
//  public void testModeOnlyMethods() {
//  }

  //  @Around("testModeOnlyMethods()")
  @Around("execution(!static !final !transient * (@cn.dreampie.ClassAnn *).set*(..))")
  public void testModeOnly(ProceedingJoinPoint joinPoint) {
    try {
      System.out.println(joinPoint.getArgs()[0]);
      joinPoint.proceed();
      System.out.println(joinPoint.getSignature());
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }
}
