package Calcpackage;

public class Calculator {
	//Making  simple calculator functions
	 public int add(int x, int y) {
	     return x + y;
	 }

	 public int subtract(int x, int y) {
	     return x - y;
	 }

	 public int multiply(int x, int y) {
	     return x * y;
	 }

	 public int divide(int x, int y) throws ArithmeticException {
	     if (y == 0) {
	         throw new ArithmeticException("Cannot divide by zero.");
	     }
	     return x / y;
	 }

}
	
