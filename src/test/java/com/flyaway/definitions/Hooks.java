package com.flyaway.definitions;

import com.flyaway.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public static void setUp() {

		HelperClass.setUpDriver();
	}

	@After
	public static void tearDown() {

		HelperClass.tearDown();
	}

}
