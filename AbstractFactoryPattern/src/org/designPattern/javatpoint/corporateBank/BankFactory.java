package org.designPattern.javatpoint.corporateBank;

import org.designPattern.javatpoint.corporateBank.bank.Bank;
import org.designPattern.javatpoint.corporateBank.bank.HDFC;
import org.designPattern.javatpoint.corporateBank.bank.ICICI;
import org.designPattern.javatpoint.corporateBank.bank.SBI;
import org.designPattern.javatpoint.corporateBank.loan.Loan;

public class BankFactory extends AbstractFactory {

	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}  

  
