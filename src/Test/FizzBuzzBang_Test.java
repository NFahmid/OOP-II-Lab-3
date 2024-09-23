package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.FizzBuzzBang;


public class FizzBuzzBang_Test {
    @Test
    public void testFizzBuzzBang() {
        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        assertEquals("FizzBuzzBang", fizzBuzzBang.mainWork(105));
        assertEquals("FizzBuzz", fizzBuzzBang.mainWork(15));
        assertEquals("FizzBang", fizzBuzzBang.mainWork(21));
        assertEquals("BuzzBang", fizzBuzzBang.mainWork(35));
        assertEquals("Fizz", fizzBuzzBang.mainWork(9));
        assertEquals("Buzz", fizzBuzzBang.mainWork(10));
        assertEquals("Bang", fizzBuzzBang.mainWork(14));
        assertEquals("Boom", fizzBuzzBang.mainWork(8));
    }
}
