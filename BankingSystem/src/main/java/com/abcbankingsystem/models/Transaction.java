package com.abcbankingsystem.models;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Import({DirectDebit.class, ExternalTransaction.class})
public class Transaction {

	private double amount;
	private LocalDate timeStamp; 
	private long sender;
	private long receiver;
}
