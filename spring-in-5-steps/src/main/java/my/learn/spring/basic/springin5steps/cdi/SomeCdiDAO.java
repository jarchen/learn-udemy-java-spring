package my.learn.spring.basic.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {
    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
