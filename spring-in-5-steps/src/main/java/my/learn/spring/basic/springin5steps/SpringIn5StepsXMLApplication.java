package my.learn.spring.basic.springin5steps;

import my.learn.spring.basic.springin5steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLApplication {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(personDAO);
            System.out.println(personDAO.getXmlJdbcConnection());
        }
    }
}
