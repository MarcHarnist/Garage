package fr.marcharnist.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.marcharnist.garage.Calculator;

class CalculatorImplTest {

	@Test
	public final void testMultiply() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 5;
		res = a*b;
		assertTrue("a et b se multiplient mal", calc.multiply(a, b) == res);
	}
	
	@Test
	public final void testDivide() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 5; 
	        res = a / b;
	    assertEquals(res, calc.divide(a, b));
		a = 0; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
	        }
		a = -5; 
	        b  = 5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b negatif");
	        }
	}


	@Test
	public final void testAdd() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
			a = 5; 
	        b  = 5;
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b positif");
	        }
		a = 0; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a nul");
	        }
		a = 5; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b nuls");
	        }
		a = -5; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b negatif");
	        }
	}

	@Test
	public final void testSubstract() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 5;
	        res = a - b;
		if (calc.substract(a, b) != res) {
		assertTrue("a et b positif", calc.substract(a, b) == res);
	        }
		a = 0; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a nul");
	        }
		a = 5; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b nuls");
	        }
		a = -5; 
	        b  = 5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a negatif");
	        }
		a = 5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("b negatif");
	        }
		a = -5; 
	        b  = -5; 
	        res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b negatif");
	        }
	}
}
