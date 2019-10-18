package com.yasir.bankAccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

public class TestAccount {
	
	private Account account;
	private Customer mockCustomer;
	

	@Before
	public void setUp() throws Exception {
		
		account = new Account();
		mockCustomer = mock(Customer.class);
	}

	@Test
	public void test_getBalance_returnBalance() {
		account = new Account(500.0);
		account.setBalance(500.0);
		double result = account.getBalance();
		assertEquals(500.0, result, 0.0);
	}
	
	@Test
	public void test_accountDepositeMethodcallsMainMethod() {
		Account account = new Account(mockCustomer);
		double value = 500.0;
		account.deposite(value);
		verify(mockCustomer).main(value);
	}

}
