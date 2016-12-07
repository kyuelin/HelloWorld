package dev.kyuelin.helloworld;

import org.junit.Before;
import org.junit.Test;

import javax.rmi.CORBA.Util;

import static dev.kyuelin.helloworld.Foo.HELLO_WORLD;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by linken on 9/4/16.
 */
public class UtilDemoTest {
    private Foo foo;

    @Test
    public void sayWorld() {
        assertEquals("world", new UtilDemo().sayWorld());
    }

    @Test
    public void sayHello() {
        assertEquals("hello", new UtilDemo().sayHello());
    }

    /**
     * Created by linken on 9/4/16.
     */
    public static class UtilDemoITest {
    }

    //@Test
    public void saySomething() {
        UtilDemo demo = mock(UtilDemo.class);
        when(demo.sayHello()).thenReturn("hello").thenReturn("more");
        assertEquals("something", demo.sayHello());
        assertEquals("more", demo.sayHello());
    }

    @Test
    public void fooGreets() {
        Foo foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(foo.greet(), HELLO_WORLD);
    }

    @Before
    public void setupMock() {
        foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
    }

    @Test
    public void demoGreets() {
        UtilDemo demo = new UtilDemo();
        assertEquals(HELLO_WORLD, demo.fooGreet(foo));
    }

    @Test(expected=FooNotAvailable.class)
    public void fooNotAvailable() {
        UtilDemo demo = new UtilDemo();
        when(foo.greet()).thenReturn(null);
        demo.question(foo, "Hello Foo");
    }

    @Test
    public void questionFoo(){
        UtilDemo demo = new UtilDemo();
        System.out.println("Demo asks Foo 'any new topic?', it should get a response");
        demo.question(foo, Foo.ANY_NEW_TOPICS);
        System.out.println("Verify Foo has been asked the question");
        verify(foo, times(1)).question(Foo.ANY_NEW_TOPICS);
    }
}