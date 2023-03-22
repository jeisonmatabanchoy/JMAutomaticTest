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
	public void addTwoNumbersv3() {
		assertEquals(20, calc.Add(10, 10));
		
	}

	@Test
	public void addThreeNumbersv3() {
		assertEquals(20, calc.Add(5, 5, 10));
		
	}

	@Test
	public void subtractTwoNumbersv3() {
		assertEquals(0, calc.Subtract(10, 10));
		
	}

	@Test
	public void subtractThreeNumbersv3() {
		assertEquals(0, calc.Subtract(20, 10, 10));
		
	}
}
