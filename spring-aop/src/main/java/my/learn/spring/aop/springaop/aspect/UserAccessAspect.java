package my.learn.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("my.learn.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info(" Check For user access");
        logger.info(" Allowed execution for {}", joinPoint);
    }
}
