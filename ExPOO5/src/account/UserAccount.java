package account;

public class UserAccount {
	
	private int numberAccount;
	private String nameAccount;
	private double moneyAccount;
	
	// construtores
	
	public UserAccount(int numberAccount, String nameAccount, double moneyAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		this.moneyAccount = moneyAccount;
	}
	
	public UserAccount(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}
	
	// get e set

	public int getNumberAccount() {
		return numberAccount;
	}


	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public double getMoneyAccount() {
		return moneyAccount;
	}

// métodos
	public void deposit(double valueDeposit) {
		this.moneyAccount += valueDeposit ;
	}

	
	public void withdrawal(double withdrawalDeposit) {
		this.moneyAccount -= withdrawalDeposit + 5;
	}
	
	public String toString() {
	    return "Conta: " + numberAccount + 
	           ", Titular: " + nameAccount + 
	           ", Saldo: R$ " + String.format("%.2f", moneyAccount);
	}
}
