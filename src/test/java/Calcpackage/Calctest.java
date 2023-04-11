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
	        
	        // Set up the mock object to return a specific value
	        when(calculator.add(2, 3)).thenReturn(5);
	        
	        // Call the method under test
	        int result = calculator.add(2, 3);
	        
	        // Verify that the mock object was called
	        verify(calculator).add(2, 3);
	        
	        // Verify the result of the method under test
	        assertEquals("Unexpected result", 5, result);
	    }
}
