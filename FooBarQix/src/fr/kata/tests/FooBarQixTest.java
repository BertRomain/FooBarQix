package fr.kata.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.kata.foobarqix.FooBarQix;

class FooBarQixTest {
	
	//	1  => 1
	@Test
	public void retourne1Avec1() {
		Integer [] myArray  = {1};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("1", value);
	}
	
	//	2  => 2
	@Test
	public void retourne2Avec2() {
		Integer [] myArray  = {2};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("2", value);
	}	
	
	//	3  => FooFoo (divisible by 3, contains 3)
	@Test
	public void retourneFooFooAvec3() {
		Integer [] myArray  = {3};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("FooFoo", value);
	}
	
	//	4  => 4
	@Test
	public void retourne4Avec4() {
		Integer [] myArray  = {4};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("4", value);
	}
	
	//	5  => BarBar (divisible by 5, contains 5)
	@Test
	public void retourneBarBarAvec5() {
		Integer [] myArray  = {5};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("BarBar", value);
	}
	
	//	6  => Foo (divisible by 3)
	@Test
	public void retourneFooAvec6() {
		Integer [] myArray  = {6};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("Foo", value);
	}
	
	//	7  => QixQix (divisible by 7, contains 7)
	@Test
	public void retourneQixQixAvec7() {
		Integer [] myArray  = {7};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("QixQix", value);
	}
	
	//	8  => 8
	@Test
	public void retourne8Avec8() {
		Integer [] myArray  = {8};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("8", value);
	}
	
	//	9  => Foo
	@Test
	public void retourneFooAvec9() {
		Integer [] myArray  = {9};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("Foo", value);
	}
	
	//	10 => Bar
	@Test
	public void retourneBarAvec10() {
		Integer [] myArray  = {10};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("Bar", value);
	}
	
	//	13 => 1Foo
	@Test
	public void retourne1FooAvec13() {
		Integer [] myArray  = {13};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("1Foo", value);
	}
	
	//	15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
	@Test
	public void retourneFooBarBarAvec15() {
		Integer [] myArray  = {15};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("FooBarBar", value);
	}
	
	//	21 => FooQix
	@Test
	public void retourneFooQixAvec21() {
		Integer [] myArray  = {21};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("FooQix", value);
	}
	
	//	33 => FooFooFoo (divisible by 3, contains two 3)
	@Test
	public void retourneFooFooFooAvec33() {
		Integer [] myArray  = {33};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("FooFooFoo", value);
	}
	
	//	51 => FooBar
	@Test
	public void retourneFooBarAvec51() {
		Integer [] myArray  = {51};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("FooBar", value);
	}
	
	//	53 => BarFoo
	@Test
	public void retourneBarFooAvec53() {
		Integer [] myArray  = {53};
		final String value = FooBarQix.convertToFooBarQix(myArray);
		assertEquals("BarFoo", value);
	}
	
	//test divisibilityStandard()
	@Test
	public void retourneStringAvecChiffreDivise() {
		Integer [] myArray  = {53};
		final String value = FooBarQix.divisibility(myArray[0]);
		assertEquals("", value);
	}
	
	//test divisibility357()
	@Test
	public void retourneStringAvecMultiple357() {
		Integer [] myArray  = {105};
		final String value = FooBarQix.divisibility(myArray[0]);
		assertEquals("FooBarQix", value);
	}
	
	//test divisibility()
	@Test
	public void retourneStringAvecMultiple35() {
		Integer [] myArray  = {35};
		final String value = FooBarQix.divisibility(myArray[0]);
		assertEquals("BarQix", value);
	}
	
	//test checkDigits()
		@Test
		public void retourneStringAvecChiffreVerifie() {
			Integer [] myArray  = {53};
			final String value = FooBarQix.checkDigits(myArray[0]);
			assertEquals("BarFoo", value);
	}
		
}
