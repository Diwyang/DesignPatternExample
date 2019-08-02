package org.designPattern.javatpoint.example;

import org.designPattern.javatpoint.example.bank.BankCustomer;
import org.designPattern.javatpoint.example.bank.creditCard.CreditCard;

public class AdapterPatternDemo {

	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}

}
