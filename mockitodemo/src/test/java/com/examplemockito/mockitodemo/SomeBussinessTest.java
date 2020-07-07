package com.examplemockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBussinessTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
	int result =	businessImpl.findTheGreatestFromAllData();
	assertEquals(25, result);	
	}
}
class DataServiceStub implements DataServices{
	@Override
	public int[] retrieveAllData() {
		return new int[] {20,6,25};
		
	}
}
