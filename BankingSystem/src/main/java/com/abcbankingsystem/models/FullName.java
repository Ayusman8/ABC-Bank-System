package com.abcbankingsystem.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FullName {

	private String firstName;
	private String middleName;
	private String lastName;
	
	public String getFullName() {
		return firstName+" "+middleName+" "+lastName;
	}
}
