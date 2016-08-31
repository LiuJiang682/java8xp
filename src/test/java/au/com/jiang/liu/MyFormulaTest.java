package au.com.jiang.liu;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyFormulaTest {

	private MyFormula myFormula;
	
	@Before
	public void setUp() {
		myFormula = new MyFormula();
	}
	
	@After
	public void tearDown() {
		this.myFormula = null;
	}
	
	@Test
	public void whenSqrtCalledThenConcertClassMethodInvoked() {
		assertEquals(6, new BigDecimal(myFormula.sqrt(36)).setScale(0).intValue());
		//Compilation error
//		System.out.println(Formula.sqrt(6));
	}
	
	@Test
	public void whenFormulaSqrtCalledThenInterfaceMethodInvoked() {
		assertEquals(5, new BigDecimal(myFormula.formulaSqrt(25)).setScale(0).intValue());
	}
}
