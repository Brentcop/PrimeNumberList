package com.gc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gc.prime.Prime;
class PrimeTDD {

	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	void test() {
		Prime primeT = new Prime();
		int expected = 2;
		int actual = primeT.prime(1);

		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		Prime primeT = new Prime();
		int expected = 3;
		int actual = primeT.prime(2);

		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		Prime primeT = new Prime();
		int expected = 5;
		int actual = primeT.prime(3);

		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		Prime primeT = new Prime();
		int expected = 7;
		int actual = primeT.prime(4);

		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		Prime primeT = new Prime();
		int expected = 13;
		int actual = primeT.prime(6);

		assertEquals(expected, actual);
	}
	void test6() {
		Prime primeT = new Prime();
		int expected = 29;
		int actual = primeT.prime(10);

		assertEquals(expected, actual);
	}
}