package au.com.jiang.liu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

import org.junit.Test;

public class PredicateTest {

	@Test
	public void predicateXp() {
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("foo"));
		System.out.println(predicate.negate().test("foo"));
	}
	
	@Test
	public void whenPredicateStringCalledThenBooleanShouldReturn() {
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		assertTrue(isEmpty.test(""));
		assertFalse(isNotEmpty.test(""));
		
		assertFalse(isEmpty.test("abc"));
		assertTrue(isNotEmpty.test("abc"));
	}
}
