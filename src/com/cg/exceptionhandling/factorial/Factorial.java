package com.cg.exceptionhandling.factorial;

public class Factorial {

	//defining two custom exceptions 
	//InvalidInput Exception is arised when a number less than 2 is input
	public class InvalidInputException extends Exception {
		public InvalidInputException(String message) {
			super(message);
		}
	}
	//Factorial Exception is arised when the result of factorial crosses the bounds of an integer
	public class FactorialException extends Exception {
		public FactorialException(String message) {
			super(message);
		}
	}

	long factorial = 1;
	//this method calculates the factorial of the input number
	public int getFactorial(int num) throws InvalidInputException, FactorialException {
		if (num < 2) {
			throw new InvalidInputException("Enter a number greater than two");
		}
		for (int i = 1; i < num + 1; i++) {
			factorial = factorial * i;
		}
		if (factorial > Integer.MAX_VALUE) {
			throw new FactorialException("Enter a smaller number");
		}
		return (int) factorial;
	}
}
