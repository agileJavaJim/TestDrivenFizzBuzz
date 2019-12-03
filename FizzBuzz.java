package myFizzPackage;

public class FizzBuzz {
	public String myFizzBuzz(int i) {
		if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("Fizz Buzz");
			return "Fizz Buzz";
		}
		else if(i % 3 == 0) {
			System.out.println("Fizz");
		return "Fizz";
		}
		else if(i % 5 == 0) {
			System.out.println("Buzz");
		return "Buzz";	
		}
		return null;
	}
}
