package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	// private double startingDeposit;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getPin() {
		return this.pin;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		this.balance = BigDecimal.valueOf(this.balance)
		               .add(BigDecimal.valueOf(amount))
									 .doubleValue();
	}

	public boolean debitAccount(double amount) {
		if (amount <= 0 || this.balance < amount) {
      return false;
    } else { 
      // this.balance -= amount;
      // this.add(new Transaction(LocalDateTime.now(), this.id, -1, amount * -1));
      // return true;
			this.balance = BigDecimal.valueOf(this.balance)
		               .subtract(BigDecimal.valueOf(amount))
									 .doubleValue();
			return true;
    }
	}
}
