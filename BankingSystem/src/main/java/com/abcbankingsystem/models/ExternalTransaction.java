package com.abcbankingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ExternalTransaction extends Transaction{

	private String branchName;
	private String branchAddress;
	private String branchPostCode;
	private int branchCode;
}
