package cn.dreampie;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Dreampie
 * @date 2015-06-16
 * @what
 */
@Aspect
public class MethodAspect {
//  @Pointcut("execution(@cn.dreampie.MethodAnn * *(..))")
//  public void testModeOnlyMethods() {
//  }

  //  @Around("testModeOnlyMethods()")
  @Around("execution(@cn.dreampie.MethodAnn !static !final !transient * *(..))")
  public void testModeOnly(ProceedingJoinPoint joinPoint) {
    try {
      System.out.println("gg");
      joinPoint.proceed();
      System.out.println("gg1");
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }
}
