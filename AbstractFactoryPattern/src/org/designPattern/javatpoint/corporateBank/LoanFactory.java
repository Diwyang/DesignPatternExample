package org.designPattern.javatpoint.corporateBank;

import org.designPattern.javatpoint.corporateBank.bank.Bank;
import org.designPattern.javatpoint.corporateBank.loan.BussinessLoan;
import org.designPattern.javatpoint.corporateBank.loan.EducationLoan;
import org.designPattern.javatpoint.corporateBank.loan.HomeLoan;
import org.designPattern.javatpoint.corporateBank.loan.Loan;

public class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}
}