package com.abcbankingsystem.models;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Component
public class Individual extends Customer{

	private Gender gender;
	private LocalDate dateOfBirth;
}
