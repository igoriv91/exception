package model.entities;

import model.exception.EntitiesException;

public class Account {
	private Integer mumber;
	private String holder;
	private Double balance;
	private Double withdrawlimit;
	
	public Account() {
	}

	public Account(Integer mumber, String holder, Double balance, Double withdrawlimit) {
		this.mumber = mumber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimit = withdrawlimit;
	}

	public Integer getMumber() {
		return mumber;
	}

	public void setMumber(Integer mumber) {
		this.mumber = mumber;
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

	public Double getWithdrawlimit() {
		return withdrawlimit;
	}

	public void setWithdrawlimit(Double withdrawlimit) {
		this.withdrawlimit = withdrawlimit;
	}
	
	public void deposit(Double amount) {
		balance+=amount;
	}

	public void withdraw(Double amount) throws EntitiesException {
		if (balance-amount < 0) {
			throw new EntitiesException("Saldo insuficiênte.");
		}
		if (amount > withdrawlimit) {
			throw new EntitiesException("Limite de saque excedido.");
		}
		balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
}
