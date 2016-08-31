package au.com.jiang.liu;

public interface Formula {

	default double sqrt(int a) {
		System.out.println("inside interface");
        return Math.sqrt(a);
    }
}
