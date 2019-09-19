package my.learn.spring.basic.springin5steps;

import my.learn.spring.basic.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{}, {}", personDAO, personDAO.getXmlJdbcConnection());
        }
    }
}
