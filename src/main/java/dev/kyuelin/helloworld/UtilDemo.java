package dev.kyuelin.helloworld;

/**
 * Created by linken on 9/4/16.
 */
public class UtilDemo {
    public static void main(String[] args) {
        System.out.println(sayHello());
    }

    public static String sayHello() {
        return "hello";
    }

    public static String sayWorld() { return "world"; }

    public static String saySomething(String something) { return something;}

    public static String fooGreet(Foo foo) {
        return foo.greet();
    }

    public String question(Foo foo, String question) {
        verifyFooConnection(foo);
        if (Foo.HELLO_WORLD.equals(foo.greet())) {
            return foo.question(question);
        }
        return "Invalid Question";
    }

    public void verifyFooConnection(Foo foo) {
        System.out.println("Is Foo available?");
        String response = foo.greet();
        if (!Foo.HELLO_WORLD.equals(response)) {
            System.out.println("No");
            throw new FooNotAvailable();
        }
        System.out.println("Yes");
    }
}
