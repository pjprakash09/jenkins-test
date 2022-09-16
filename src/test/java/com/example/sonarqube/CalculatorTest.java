package com.example.sonarqube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
	
	@InjectMocks
	Calculator calculator;
	
	@Test
	void test1() {
		int add = calculator.add(11, 9);
		assertEquals(20, add);
	}
	
	@Test
	void test2() {
		int substracted = calculator.substract(11, 9);
		assertEquals(2, substracted);
	}
	
	@Test
	void test3() {
		long multiplied = calculator.multiply(11, 9);
		assertEquals(99, multiplied);
	}
	
	@Test
	void test4() {
		double divided = calculator.divide(81, 9);
		assertEquals(9.0, divided);
	}
	
	@Test
	void test5() {
		double remainder = calculator.remainder(10, 2);
		assertEquals(0, remainder);
	}

}
