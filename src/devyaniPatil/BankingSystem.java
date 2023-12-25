package devyaniPatil;
/*Assignment - 13 : 

Create a Banking System which has the following functionality.

Create two objects to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.

when calling the method on the first object.
Output: user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

when calling the method on the second object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance */

class BankingSystem {
	String username;
	int balance;
	int debitCount, creditCount, printCount;
	static int allDebitCount;
	static int allCreditCount;
	static int allPrintCount;

	void debitAmt(int Amt) {
		if (Amt <= balance) {
			balance = balance - Amt;

		} else {
			System.out.println(username + "having low account balance");
		}
		debitCount++;
		allDebitCount++;
	}

	void creditAmt(int amt) {
		balance = balance + amt;
		creditCount++;
		allCreditCount++;
	}

	void printBalance() {
		System.out.println(this.username + " current balance is" + this.balance);
		printCount++;
		allPrintCount++;
	}

	void setUserDetails(int balance, String username) {
		this.balance = balance;
		this.username = username;
	}

	void individualTransactionSummary() {
		System.out.println(username + " transaction Summary:credit-" + creditCount + "times Debit-" + debitCount
				+ "times,printbalance-" + printCount + "times");
	}

	void alltransactionSummary() {
		System.out.println(" Alltrabsaction summary:Credit-" + allCreditCount + "times,Debit-" + allDebitCount
				+ "times,printBalance-" + printCount + "times");
	}

	public static void main(String[] args) {
		BankingSystem user1 = new BankingSystem();
		BankingSystem user2 = new BankingSystem();

		user1.setUserDetails(10000, "devyani");
		user1.debitAmt(2000);
		user1.debitAmt(3000);
		user1.creditAmt(2000);
		user1.printBalance();
		user1.individualTransactionSummary();
		user2.setUserDetails(3000, "adi");
		user2.creditAmt(300);
		user2.creditAmt(500);
		user2.debitAmt(600);
		user2.printBalance();
		user2.individualTransactionSummary();
		user1.alltransactionSummary();
		user2.alltransactionSummary();
	}
}
