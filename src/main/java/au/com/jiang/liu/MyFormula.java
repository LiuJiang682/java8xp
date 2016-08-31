package au.com.jiang.liu;

public class MyFormula extends MyAbstractFormula implements Formula {

	@Override
	public double sqrt(int a) {
		System.out.println("inside Concert class.");
		return Math.sqrt(a);
	}
	
	public double formulaSqrt(int a) {
		return Formula.super.sqrt(a);
	}

}
