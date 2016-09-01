package au.com.jiang.liu;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BoxPredicate {

	public static Predicate<Box> isGreenApple() {
		return p -> p.getColor().equalsIgnoreCase("green");
	}
	
	public static Predicate<Box> isHeavyApple() {
		return p -> p.getWeight() > 150;
	}
	
	public static List<Box> filter(List<Box> apples, Predicate<Box> predicate) {
		return apples.stream().filter(predicate).collect(Collectors.<Box>toList());
	}
}
