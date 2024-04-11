package com.abcbankingsystem.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

	private List<Transaction> transactionList;
	private List<Account> customerAccountList;
	private List<Customer> customerList;

}
