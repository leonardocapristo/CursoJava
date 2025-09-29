package entities;

import exceptions.LimiteInsuficienteException;
import exceptions.SaqueException;
import exceptions.TesteException;

public class Account {

	protected Integer number;
	protected String holder;
	protected Double balance;
	protected Double withdrawLimit;
	
	

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		this.balance += amount;

	}

														/*Propagando as excecoes, se elas fossem RuntimeException nao precisaria */
	
	public void withdraw(Double amount) throws SaqueException,LimiteInsuficienteException, TesteException {
		
		if (this.balance <= 0 ) {
			 throw new SaqueException();
		} 
		else if (amount > withdrawLimit) {
			throw new LimiteInsuficienteException();
		} else if (amount == 0) {
			throw new TesteException();
		}
		this.balance -= amount;
	}

}
