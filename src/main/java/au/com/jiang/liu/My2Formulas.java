package au.com.jiang.liu;

public class My2Formulas implements Formula, AnotherFormula {

	@Override
	public double sqrt(int a) {
		System.out.println("inside  My2Formulas class");
		return AnotherFormula.super.sqrt(a);
	}

	public double formulaSqrt(int i) {
		System.out.println("inside formulaSqrt method");
		return Formula.super.sqrt(i);
	}

}
