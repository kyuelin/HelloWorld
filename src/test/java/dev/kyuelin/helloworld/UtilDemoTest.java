package dev.kyuelin.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by linken on 9/4/16.
 */
public class UtilDemoTest {
    @Test
    public void sayHello() {
        assertEquals("hello", new UtilDemo().sayHello());
    }

    /**
     * Created by linken on 9/4/16.
     */
    public static class UtilDemoITest {
    }
}