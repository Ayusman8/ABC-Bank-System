package com.abcbankingsystem.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Menu {

	@Autowired
	private List<Transaction> transactionList;
	private List<Account> customerAccountList;
	private List<Customer> customerList;

}
