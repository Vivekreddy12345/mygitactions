package Calcpackage;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

//import hw1.Calculator;


//@SuppressWarnings("unused")
public class Calctest {
	//testing the addition and substraction with unit tests 
	  @Test
	    public void testAdd() {
	        Calculator calculator = new Calculator();
	        int result = calculator.add(3, 4);
	        assertEquals(7, result);
	    }
	
	  @Test
	    public void testSubtract() {
	        Calculator calculator = new Calculator();
	        int result = calculator.subtract(7, 4);
	        assertEquals(3, result);
	    }
	  @Test
	    public void testmultiplication() {
	        // Create a mock object for the Calculator class
	        Calculator calculator = mock(Calculator.class);
	        when(calculator.multiply(2, 3)).thenReturn(6);
	        int result = calculator.multiply(2, 3);
	        verify(calculator).multiply(2, 3);
	         assertEquals(6, result);
	    }
}
