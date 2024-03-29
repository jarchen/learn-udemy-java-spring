package my.learn.spring.basic.springin5steps.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, actualResult);
    }
}
