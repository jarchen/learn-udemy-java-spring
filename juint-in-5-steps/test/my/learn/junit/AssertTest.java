package my.learn.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void test() {
        boolean cond = true;

        assertEquals(1, 2);
        assertTrue(cond);
        assertFalse(cond);
    }
}
