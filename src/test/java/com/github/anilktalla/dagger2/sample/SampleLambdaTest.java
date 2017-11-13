package com.github.anilktalla.dagger2.sample;

import org.junit.Assert;
import org.junit.Test;

public class SampleLambdaTest {

	@Test
	public void testHandleRequestSuccess() {
		Assert.assertEquals("Hello FooBar", new SampleLambda().handleRequest(new Request(), null).getMessage());
	}
}
