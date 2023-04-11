package Calcpackage;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

//import hw1.Calculator;


//@SuppressWarnings("unused")
public class Calctest {
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
	    public void testAddition() {
	        // Create a mock object for the Calculator class
	        Calculator calculator = mock(Calculator.class);
	        when(calculator.add(2, 3)).thenReturn(5);
	        int result = calculator.add(2, 3);
	        verify(calculator).add(2, 3);
	         assertEquals(5, result);
	    }
}
