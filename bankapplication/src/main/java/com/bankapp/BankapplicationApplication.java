package com.bankapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;

@SpringBootApplication
public class BankapplicationApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(BankapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		/*Account account1=new Account("dilip", 9959, "dilip@gmailcom", 
				"mpl","hdfc", 5000,"SAVINGS");
		
		Account account2=new Account("balu", 7995, "balu@gmailcom", 
				"banglore","ICIC", 7000,"CURRENT");
		
		Account account3=new Account("hari", 9182, "hari@gmailcom", 
				"nellore","SBI", 4000, "SAVINGS");
		
		Account account4=new Account("sadhik", 9173, "sadhik@gmailcom", 
				"chennai","Syndicate", 8000,"SAVINGS");
		
		
		
		
		accountService.addCustomerAccount(account1);
		accountService.addCustomerAccount(account2);
		accountService.addCustomerAccount(account3);
		accountService.addCustomerAccount(account4);
		*/

		
	}

}
