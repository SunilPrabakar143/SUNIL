package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void bankSaving(String Saving) {
		System.out.println("new saving is " + Saving);
		super.bankSaving(Saving);
	}

	@Override
	public void bankFixed(String Fixed) {
		System.out.println("new fixed is " + Fixed);
		super.bankFixed(Fixed);
	}

	@Override
	public void bankDeposit(String bankDeposit) {
		System.out.println("new deposit is " + bankDeposit);
		super.bankDeposit(bankDeposit);
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.bankSaving("8%");
		a.bankFixed("7%");
		a.bankDeposit("8%");

	}
}
