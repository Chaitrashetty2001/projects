//package com.example.demo.service;
//
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.example.demo.dto.ResponseDto;
//import com.example.demo.dto.TransactionDto;
//import com.example.demo.entity.Account;
//import com.example.demo.entity.Customer;
//import com.example.demo.entity.Transaction;
//import com.example.demo.repository.AccountRepository;
//import com.example.demo.repository.CustomerRepository;
//import com.example.demo.repository.TransactionRepository;
//
//@Service
//public class BankServiceImpl implements BankService {
//
//	@Autowired
//	private AccountRepository accRepo;
//
//	@Autowired
//	private CustomerRepository custRepo;
//
//	@Autowired
//	TransactionRepository transactionRepository;
//
////	@Override
////	public ResponseDto insertNewCustomer(Customer customer, String accountType, float balance) {
////		custRepo.save(customer);
////		Account account1 = new Account();
////		account1.setCustId(customer.getCustid());
////		account1.setAccType(accountType);
////		account1.setBalance(balance);
////
////		accRepo.save(account1);
////
////		ResponseDto responseDto = new ResponseDto(); // json format
////		responseDto.setMessage("new customer added successfully");
////		return responseDto;
////
////	}
//
////	@Override
////	@Transactional 
////	public String fundTransfer(long fromAccNo, long toAccNo, int amount) {
////
////		Account account1 = accRepo.findAccountByAccNo(fromAccNo);
////		Account account2 = accRepo.findAccountByAccNo(toAccNo);
////		Transaction transaction = new Transaction();
////		if (account1.getBalance() - amount > 0) {
////			account1.setBalance(account1.getBalance() - amount);
////
////			account2.setBalance(account2.getBalance() + amount);
////
////			accRepo.save(account1);
////
////			accRepo.save(account2);
////
////			transaction.setFromAccNo(fromAccNo);
////			transaction.setToAccNo(toAccNo);
////			transaction.setAmount(amount);
////
////			transactionRepository.save(transaction);
////
////			return "sucessfully money transfered";
////		}
////
////		return "money transfere failed";
////
////	}
//	
//
///////exectuded one
//	@Override
//
//	public List<TransactionDto> getStatement(Date transactionDateTime, long accNo) {
//		Account account = accRepo.findByAccNo(accNo);
//		if (account != null) {
//			return transactionRepository.findByFromAccNoAndTransactionDateTime( transactionDateTime ,accNo);
//		} else {
//			System.out.println("account not found");
//
//		}
//		return null;
//
////public List<TransactionDto> getStatement(String transactionDateTime, long accNo) {
////	Account account =accRepo.findAccountByAccNo(accNo);
////	if(account!=null)
////	{
////	  List<TransactionDto> credit = transactionRepository.findAccountByAccNoAndTransactionDate(accNo,transactionDateTime);
////	  for(TransactionDto dto:credit)
////		  dto.setStatus("credit");
////	  
////	  List<TransactionDto> debit = transactionRepository.findAccountByAccNoAndTransactionDate1(accNo,transactionDateTime);
////	  for(TransactionDto dto:debit)
////		  dto.setStatus("debit");
////	  credit.addAll(debit);
////	  return credit;
////	}
////	else {
////		System.out.println("account not found");
////		return null;
////	}

////	
////}
//
//	}
//
//	
//}
