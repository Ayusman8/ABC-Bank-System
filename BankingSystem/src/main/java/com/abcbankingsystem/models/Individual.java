package com.abcbankingsystem.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Individual extends Customer{

	private String surname;
	private String gender;
	private String dateOfBirth;
}
