package com.ebix.customer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ebix.customer.Customer;


public class CustomerTest {
	
	
	@Test
	public void getCustNameTest(){
		Customer cust=new Customer();
		cust.setCustName("billa");
		
		String expected="billa";
		String actual=cust.getCustName();
		assertEquals(expected, actual);
	}
}
