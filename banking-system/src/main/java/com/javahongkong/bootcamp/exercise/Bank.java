package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	// private static long accountNumberCounter = 0;
	  // 會有 thread safe 問題, 隨時可能多個開戶人持有同一 id number.
		  // Solution: synchronized thread

	// private static long accountNumberCounter = 0;   // 如果 static, 既可放入 Bank Class, 又可放入 Account Class.
	// ! non-static, assume HSBC has its own set of account no.
	private long accountNumberCounter = 0L;            // 只可放入 Bank Class, 不能放入 Account Class.
	private LinkedHashMap<Long, Account> accounts;     // object reference

	public Bank() {
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		return this.accounts.get(accountNumber);
	}

	public synchronized Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		long accountNum = ++accountNumberCounter;
		Account account = new CommercialAccount(company, accountNum, pin, startingDeposit);
		this.accounts.put(accountNum, account);
		return accountNum;
	}

	public synchronized Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		long accountNum = ++accountNumberCounter;
		Account account = new ConsumerAccount(person, accountNum, pin, startingDeposit);
		this.accounts.put(accountNum, account);
		return accountNum;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		return this.accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		return this.accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		return this.accounts.get(accountNumber).debitAccount(amount);
	}

	public static void main(String[] args) {
		// Long l1 = 0L;
		// ! The local variable l1 may not have been initialized.
		// ! Both read and write not OK if no initialization.
		// l1++;      // write value into l1 --> not OK
		// System.out.println(l1);    // read value from l1 --> not OK
	}

  
}
