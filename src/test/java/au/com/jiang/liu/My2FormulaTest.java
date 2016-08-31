package au.com.jiang.liu;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class My2FormulaTest {

	private My2Formulas my2Formulas;
	
	@Before
	public void setUp() {
		my2Formulas = new My2Formulas();
	}
	
	@Test
	public void whenSqrtCalledThenAnotherFormulaInterfaceMethodInvoked() {
		assertEquals(6, new BigDecimal(my2Formulas.sqrt(6)).setScale(0).intValue());
	}
	
	@Test
	public void whenFormulaSqrtCalledThenFormulaInterfaceMethodInvoked() {
		assertEquals(5, new BigDecimal(my2Formulas.formulaSqrt(25)).setScale(0).intValue());
	}
}
