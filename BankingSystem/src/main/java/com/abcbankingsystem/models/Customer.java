package com.abcbankingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private long accountNumber;
	private String name;
	private String address;
	private long contactNumber;
	private String email;
	private String password;
}
