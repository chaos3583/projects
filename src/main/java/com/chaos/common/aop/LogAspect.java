package com.chaos.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @program: demo
 * @description: 一个日志切面类
 * @author: 廖鹏
 * @create: 2018-11-19
 **/
@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public * com.chaos.demo.web.*.*(..))")
    public void webPointCut() {
    }

    @Before("webPointCut()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        System.out.println("【注解：Before】------------------切面  before");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        System.out.println("【注解：Before】浏览器输入的网址=URL : " + request.getRequestURL().toString());
        System.out.println("【注解：Before】HTTP_METHOD : " + request.getMethod());
        System.out.println("【注解：Before】IP : " + request.getRemoteAddr());
        System.out.println("【注解：Before】执行的业务方法名=CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("【注解：Before】业务方法获得的参数=ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webPointCut()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("【注解：AfterReturning】这个会在切面最后的最后打印，方法的返回值 : " + ret);
    }

    //后置异常通知
    @AfterThrowing("webPointCut()")
    public void throwss(JoinPoint jp) {
        System.out.println("【注解：AfterThrowing】方法异常时执行.....");
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("webPointCut()")
    public void after(JoinPoint jp) {
        System.out.println("【注解：After】方法最后执行.....");
    }

    //环绕通知,环绕增强，相当于MethodInterceptor
    @Around("webPointCut()")
    public Object arround(ProceedingJoinPoint pjp) {
        System.out.println("【注解：Around . 环绕前】方法环绕start.....");
        try {
            Object o = pjp.proceed();//如果不执行这句，会不执行切面的Before方法及controller的业务方法
            System.out.println("【注解：Around. 环绕后】方法环绕proceed，结果是 :" + o);
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}
