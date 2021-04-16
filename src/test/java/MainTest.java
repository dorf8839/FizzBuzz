import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static Main subject;

    @BeforeAll
    static void initFizzBuzz(){
        subject = new Main();
    }

    @org.junit.jupiter.api.Test
    void checkFizz() {
        assertEquals("Fizz", subject.fizzBuzzResult(3));
    }

    @org.junit.jupiter.api.Test
    void checkBuzz() {
        assertEquals("Buzz", subject.fizzBuzzResult(5));
        assertEquals("Buzz", subject.fizzBuzzResult(9));
    }

    @org.junit.jupiter.api.Test
    void checkFizzBuzz() {
        assertEquals("FizzBuzz", subject.fizzBuzzResult(15));
    }
}