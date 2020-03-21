package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        assertEquals("Hello Rich", greeting.helloWorld("Rich"));
    }
}