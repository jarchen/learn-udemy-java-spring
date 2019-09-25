package my.learn.spring.basic.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDAO daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 4});
        int actualResult = business.findGreatest();
        assertEquals(4, actualResult);
    }

    @Test
    public void testBasicScenarioNoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        int actualResult = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testBasicScenarioEqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 2});
        int actualResult = business.findGreatest();
        assertEquals(2, actualResult);
    }
}
