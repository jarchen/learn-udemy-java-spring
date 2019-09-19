package my.learn.spring.basic.springin5steps;

import my.learn.spring.basic.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {

            SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
        }
    }
}
