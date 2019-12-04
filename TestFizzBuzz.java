package myFizzPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	@Test
	void canReturnFizzBuzz() {
		FizzBuzz game = new FizzBuzz();
	
		assertEquals("Fizz Buzz", game.myFizzBuzz(15));
	}
	@Test
	void canReturnFizz() {
		FizzBuzz game = new FizzBuzz();
	
		assertEquals("Fizz", game.myFizzBuzz(9));
	}
	@Test
	void canReturnBuzz() {
		FizzBuzz game = new FizzBuzz();
	
		assertEquals("Buzz", game.myFizzBuzz(10));
	}
	@Test
	void canReturnNum() {
		FizzBuzz game = new FizzBuzz();
		int i = 4;
		
		assertEquals(4, game.myFizzBuzzNum(i));
	}

}
