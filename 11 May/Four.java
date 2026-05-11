class BankAccount {
	String m_accountNumber;
	double m_balance = 0;
	double m_interestRate = 0;

	BankAccount(double interestRate) {
		m_interestRate = interestRate;
	}

	void deposit(double amount) {
		m_balance += amount;
		System.out.println("TRANSACTION");
		System.out.println("Deposit: " + amount + " Balance: " + m_balance);
	}
}

class SavingsAccount extends BankAccount {
	double m_minimumBalance = 0;
	
	SavingsAccount(double interestRate) {
		super(interestRate);
	}
	
	void withdraw(double amount) {
		if (m_balance - amount >= 0)
			m_balance -= amount;
		else 
			return;
		System.out.println("TRANSACTION");
		System.out.println("Withdraw: " + amount + " Balance: " + m_balance);
	}
}


public class Four {
	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount(0.05);
		SavingsAccount mySavingsAccount = new SavingsAccount(0.05);

		myBankAccount.deposit(10000);

		mySavingsAccount.deposit(10000);
		mySavingsAccount.withdraw(4000);
	}
}
