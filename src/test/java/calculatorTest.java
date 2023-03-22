import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import CalculatorProject.Calculator;

public class calculatorTest {
	Calculator calc;
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void addTwoNumbersv2() {
		assertEquals(20, calc.Add(10, 10));
		
	}

	@Test
	public void addThreeNumbersv2() {
		assertEquals(20, calc.Add(5, 5, 10));
		
	}

	@Test
	public void subtractTwoNumbersv2() {
		assertEquals(0, calc.Subtract(10, 10));
		
	}

	@Test
	public void subtractThreeNumbersv2() {
		assertEquals(0, calc.Subtract(20, 10, 10));
		
	}
}
