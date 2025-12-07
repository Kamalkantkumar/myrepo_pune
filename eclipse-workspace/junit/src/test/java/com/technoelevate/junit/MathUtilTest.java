package com.technoelevate.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest {
	MathUtils mathUtils = null;

	@Test
	//@RepeatedTest(4)
	public void addTest() {
		boolean isServerUp = true;
		assumeFalse(isServerUp);
		// MathUtils mathUtils = new MathUtils();
		assertEquals(8, mathUtils.sum(2, 8), "jguh");
		System.out.println("add test");
	}

	@Test
	// @EnabledOnOs(OS.WINDOWS)
	// @EnabledIfEnvironmentVariable(matches = "", named = "")
	public void circleTest() {
		// MathUtils mathUtils = new MathUtils();
		assertEquals(Math.PI, mathUtils.areaOfCircle(1), "testing with respect to area of circle ");
		System.out.println("area of circle test");

	}

	@Test
	// @EnabledOnJre(JRE.JAVA_16)

	public void divideTest() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divideTest(10, 0));
		System.out.println("divide test");

	}

	@BeforeEach
	public void init() {
		mathUtils = new MathUtils();

		// System.out.println("hello");

	}

	@BeforeAll
	//
	public static void beforeall() {

		System.out.println("this is before all");

	}
}
