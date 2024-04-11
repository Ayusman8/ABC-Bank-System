package com.abcbankingsystem.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

	private double amount;
	private String timeStamp; 
	private long sender;
	private long receiver;
}
