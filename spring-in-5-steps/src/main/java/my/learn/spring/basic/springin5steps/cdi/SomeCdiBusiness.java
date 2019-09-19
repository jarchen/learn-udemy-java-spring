package my.learn.spring.basic.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
    @Autowired
    SomeCdiDAO someCDIDAO;

    public SomeCdiDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
