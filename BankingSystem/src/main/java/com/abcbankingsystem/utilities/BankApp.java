package com.abcbankingsystem.utilities;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abcbankingsystem.models.Account;
import com.abcbankingsystem.models.Address;
import com.abcbankingsystem.models.Customer;
import com.abcbankingsystem.models.FullName;
import com.abcbankingsystem.models.SavingsAccount;
import com.abcbankingsystem.models.Transaction;

public class BankApp {

	private static final Logger logger=LoggerFactory.getLogger(BankApp.class);
	
	public static void main(String[] args) {

		// Bean factory
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(new ClassPathResource("bank-spring-config.xml"));	

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(Account.class);
		ctx.register(Customer.class);
		ctx.register(Transaction.class);
		ctx.register(FullName.class);
		ctx.register(Address.class);
		
		ctx.refresh();

		
		Account account = (Account) ctx.getBean("account");
		SavingsAccount savings = (SavingsAccount) account;
		savings.setIntrestRate(8.55f);
		savings.setOpenDate(LocalDate.of(2024, 4, 11));
		savings.setRunningTotals(15);		
		logger.info(savings.getRunningTotals() + "   " + savings.getOpenDate()+" "+savings.getIntrestRate());
		
		Customer customer = (Customer) ctx.getBean("customer");
		Address address = customer.getAddress();
		address.setDoorNo("16");
		address.setStreetName("First Street");
		address.setPostalCode(602024);
		address.setState("Karnataka");
		address.setCity("Bangalore");
		address.setCountry("India");
		address.setLongitude("18.5");
		address.setLatitude("33.3");
		logger.info("Customer address-->"+customer.getAddress().getCity());

		ctx.registerShutdownHook();
	}
}
