package my.learn.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* my.learn.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* my.learn.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("my.learn.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && my.learn.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("within(my.learn.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }
}
