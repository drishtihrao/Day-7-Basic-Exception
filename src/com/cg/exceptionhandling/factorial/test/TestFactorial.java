package com.cg.exceptionhandling.factorial.test;
/*
 * A class to calculate the factorial of the number
 * The maximum integer value to return an integer factorial is checked
 * A try-catch method is used for exception handling
 */
import com.cg.exceptionhandling.factorial.Factorial;
import com.cg.exceptionhandling.factorial.Factorial.FactorialException;
import com.cg.exceptionhandling.factorial.Factorial.InvalidInputException;

public class TestFactorial {
	public static void main(String args[]) {
		Factorial fact = new Factorial();
		try {
			int ans = fact.getFactorial(26);
			System.out.println("factorial = " + ans);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (FactorialException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}