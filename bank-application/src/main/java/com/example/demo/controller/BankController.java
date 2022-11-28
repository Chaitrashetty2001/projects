//package com.example.demo.controller;
//
//import java.text.ParseException;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.ResponseDto;
//import com.example.demo.dto.TransactionDto;
//import com.example.demo.entity.Customer;
//import com.example.demo.service.BankServiceImpl;
//
//@RestController
//@RequestMapping("/bank")
//public class BankController {
//
//	@Autowired
//	public BankServiceImpl bankserviceimp;
//
////	@PostMapping("/addCustomer")
////	public ResponseDto newCustomer(@RequestBody Customer customer, @RequestParam String accountType,
////			@RequestParam float balance) {
////		return bankserviceimp.insertNewCustomer(customer, accountType, balance);
////	}
//
////	@PostMapping("/fundTransfer")
////	public String fundTransfer(@RequestParam long fromAccNo, long toAccNo, int amount) {
////		return bankserviceimp.fundTransfer(fromAccNo, toAccNo, amount);
////	}
//
//	@GetMapping("/showTransactions")
//	public List<TransactionDto> getStatement(@RequestParam("enter date") Date transactionDateTime,
//			@RequestParam("Enter your account no") long accNo) throws ParseException {
//		return bankserviceimp.getStatement(transactionDateTime, accNo);
//	}
//
////three diff controller
//
//}
