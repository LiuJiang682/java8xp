package au.com.jiang.liu;

import static au.com.jiang.liu.BoxPredicate.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BoxPredicateTest {

	@Test
	public void whenIsGreenAppleCalledWithGreenBoxThenTrueShouldReturn() {
		Box box = new Box(68, "green");
		assertTrue(isGreenApple().test(box));
	}
	
	@Test
	public void whenIsHeavyAppleCalledWith250ThenTrueShouldReturn() {
		Box box = new Box(250, "red");
		assertTrue(isHeavyApple().test(box));
	}
	
	@Test
	public void whenIsHeavyAppleCalledWith50ThenFalseShouldReturn() {
		Box box = new Box(50, "redd");
		assertFalse(isHeavyApple().test(box));
	}
	
	@Test
	public void whenFilterCalledWith3BoxesAndIsGreenApplePredicateThen2GreenAppleShouldReturn() {
		List<Box> inventory = given3Apples();
		List<Box> greenApples = filter(inventory, isGreenApple());
		assertNotNull(greenApples);
		assertTrue(2 == greenApples.size());
	}

	private static List<Box> given3Apples() {
		List<Box> inventory = Arrays.asList(new Box(80, "green"), new Box(
		        155, "green"), new Box(120, "red"));
		return inventory;
	}
	
	@Test
	public void whenFilterCalledWith3BoxesAndIsHeavyApplePredicateThen1AppleShouldReturn() {
		List<Box> inventory = given3Apples();
		List<Box> heavyApples = filter(inventory, isHeavyApple());
		assertNotNull(heavyApples);
		assertTrue(1 == heavyApples.size());
	}
	
	@Test
	public void whenFilterCalledWith3BoxesAndWeiredPredicateThenEmptyListReturn() {
		List<Box> weiredApples = filter(given3Apples(), (Box a) -> a.getWeight() < 80 || "brown".equalsIgnoreCase(a.getColor()));
		assertNotNull(weiredApples);
		assertTrue(weiredApples.isEmpty());
	}
}
