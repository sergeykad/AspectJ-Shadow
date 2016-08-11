package com.my.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;

@Aspect
public class MethodLogger {
    @Around("execution(* *.power(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        System.out.printf(
                "#%s(%s): %s in %s millis\n",
                MethodSignature.class.cast(point.getSignature()).getMethod().getName(),
                Arrays.toString(point.getArgs()),
                result,
                System.currentTimeMillis() - start
        );
        return result;
    }
}