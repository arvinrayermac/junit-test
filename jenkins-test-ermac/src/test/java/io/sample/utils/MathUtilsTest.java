package io.sample.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private MathUtils mathUtils;
	
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}
	
	@Test
	void testAddition() {
		assertEquals(2, mathUtils.add(1, 1));
	}

	@Test
	void testSubtraction() {
		assertEquals(0, mathUtils.subtract(1, 1));
	}

	@Test 
	void testMultiply() {
		assertEquals(1, mathUtils.multiply(1, 1));
	}
	
	@Test
	void testDivide() {
		assertEquals(1, mathUtils.divide(1, 1));
	}
	
	
}
