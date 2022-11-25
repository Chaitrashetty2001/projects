package com.example.demo.service;

import com.example.demo.entity.Customer;

public interface BankService {

	

	String insertNewCustomer(Customer customer, String accountType, float balance);

	String fundTransfer(long fromAccNo, long toAccNo, int amount);



	

}
