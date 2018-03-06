package com.example.administrator.aopaspectj.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by Administrator
 * 2018/3/6 0006.
 */
@Aspect
public class LogAspectJ {
    private static final String TAG = "LogAspectJ";

    @Pointcut("execution(@com.example.administrator.aopaspectj.aspectj.LogOutput * *(..))")
    public void executionLogAspectJ() {
    }

    @Around("executionLogAspectJ()")
    public Object logoutput(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String className = signature.getDeclaringType().getSimpleName();
        String methodName = signature.getName();
        Log.e(TAG,"className = " + className + ", methodName = " + methodName);
        Object proceed = joinPoint.proceed();
        Log.e(TAG, "duration time = " + (System.currentTimeMillis() - start));
        return proceed;
    }

}
