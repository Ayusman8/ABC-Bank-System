package com.abcbankingsystem.models;

import java.time.LocalDate;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Import({SavingsAccount.class, CurrentAccount.class})
public class Account {
	
	private int runningTotals;
	private LocalDate openDate;
}
