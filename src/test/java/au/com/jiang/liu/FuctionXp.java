package au.com.jiang.liu;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.function.Function;

import org.junit.Test;

public class FuctionXp {

	@Test
	public void whenFuctionToIntegarCalledThenAnIntegerShouldReturn() {
		Function<String, Integer> toInteger = Integer::valueOf;
		Object object = toInteger.apply("123");
		assertNotNull(object);
		assertTrue(object instanceof Integer);
		assertTrue( 123 == (Integer)object);
	}
	
	@Test(expected = NumberFormatException.class)
	public void whenFunctionToIntegerCalledWithInvalidStringThenExceptionRaised() {
		Function<String, Integer> toInteger = Integer::valueOf;
		toInteger.apply("a");
	}
	
	@Test
	public void whenFunctionChainCalledThenStringConvertToIntegerThenBackToString() {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);
		
		Object object = backToString.apply("123");
		assertNotNull(object);
		assertTrue(object instanceof String);
		assertTrue("123".equals(object));
	}
}
