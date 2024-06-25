package com.qa;


import org.junit.jupiter.api.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizz() {
        int One = 21;
        assertEquals("Fizz", fizzBuzz.check(One));
    }
@Test
    public void buzz() {
        int One = 35;
        assertEquals("Buzz", fizzBuzz.check(One));
    }
@Test
    public void fizzbuzz() {
        int One = 30;
        assertEquals("FizzBuzz", fizzBuzz.check(One));
    }

@Test
    public void number() {
        int One = 22;
        assertEquals(Integer.toString(One), fizzBuzz.check(One));
    }

//
//[16:00] Benbelaid, Jordan
//    enter a number as a parameter,
//    if its divisible by 3 return the String "Fizz",
//    divisible by 5 return "Buzz",
//    divisible by 5 and 3 return "FizzBuzz",
//            if not divisible by any return the number entered
//
//}
}