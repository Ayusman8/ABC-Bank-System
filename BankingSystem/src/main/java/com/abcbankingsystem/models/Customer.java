package com.abcbankingsystem.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Import({Individual.class, Corporate.class})
public class Customer {

	private long accountNumber;
	
	@Autowired
	private FullName name;
	@Autowired
	private Address address;
	
	private long contactNumber;
	private String email;
	private String password;
}
