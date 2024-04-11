package com.abcbankingsystem.utilities;

import java.util.Currency;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.abcbankingsystem.models.Account;
import com.abcbankingsystem.models.CurrentAccount;
import com.abcbankingsystem.models.SavingsAccount;

public class BankApp {

	public static void main(String[] args) {
		
		//Bean factory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("bank-spring-config.xml"));	
		
		
		Account account1 = (Account) factory.getBean("savingsAccount");
		System.out.println(account1.getRunningTotals()+"   "+ account1.getOpenDate());
		
		Account account2 = (Account) factory.getBean("currentAccount");
		System.out.println(account2.getRunningTotals()+"   "+ account2.getOpenDate());
		
		SavingsAccount savings = (SavingsAccount) account1;
		System.out.println(savings.getIntrestRate());
		
		CurrentAccount current = (CurrentAccount) account2;
		System.out.println(current.getOverDraftLimit());
	}
}
