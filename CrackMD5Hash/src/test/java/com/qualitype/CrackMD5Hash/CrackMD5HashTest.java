package com.qualitype.CrackMD5Hash;

import org.junit.Assert;
import org.junit.Test;

public class CrackMD5HashTest {
	CrackMD5Hash classUnderTest = new CrackMD5Hash();

	@Test
	public void CrackTest0000() {
		final String expected = classUnderTest.getPassword("4a7d1ed414474e4033ac29ccb8653d9b");
		final String actual = "0000";
		Assert.assertEquals("Test", expected, actual);
	}

	@Test
	public void CrackTest9999() {
		final String expected = classUnderTest.getPassword("fa246d0262c3925617b0c72bb20eeb1d");
		final String actual = "9999";
		Assert.assertEquals("Test", expected, actual);
	}

	@Test
	public void CrackTest1111() {
		final String expected = classUnderTest.getPassword("b59c67bf196a4758191e42f76670ceba");
		final String actual = "1111";
		Assert.assertEquals("Test", expected, actual);
	}

	@Test
	public void CrackTest1234() {
		final String expected = classUnderTest.getPassword("81dc9bdb52d04dc20036dbd8313ed055");
		final String actual = "1234";
		Assert.assertEquals("Test", expected, actual);
	}

	@Test
	public void CrackTest5743() {
		final String expected = classUnderTest.getPassword("31f81674a348511b990af268ca3a8391");
		final String actual = "5743";
		Assert.assertEquals("Test", expected, actual);
	}

}
