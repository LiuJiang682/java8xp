package au.com.jiang.liu;

public interface AnotherFormula {

	default double sqrt(int a) {
		System.out.println("inside  AnotherFormula interface");
        return Math.sqrt(a * a);
    }
}
