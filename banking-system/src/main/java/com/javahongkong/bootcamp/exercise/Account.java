package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	// private double startingDeposit;
	private double balance;
	private int accountCounter;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.pin = pin;
		this.balance = startingDeposit;

		accountCounter++; // Increment the counter for each new account
    this.accountNumber = (long) (accountCounter * 1111); // Generate account number
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		this.balance = BigDecimal.valueOf(amount)
		               .add(BigDecimal.valueOf(this.balance))
									 .doubleValue();
	}

	public boolean debitAccount(double amount) {
		// complete the function
		if (amount <= 0 || amount > this.balance) {
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
