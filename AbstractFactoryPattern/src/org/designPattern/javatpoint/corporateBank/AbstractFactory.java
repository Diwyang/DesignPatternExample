package org.designPattern.javatpoint.corporateBank;

import org.designPattern.javatpoint.corporateBank.bank.Bank;
import org.designPattern.javatpoint.corporateBank.loan.Loan;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);

}
