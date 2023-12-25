package devyaniPatil;
//Assignment - 3

/*Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method*/

class BankDetails {
	int count = 0;
	int debitCount = 0;
	int balance = 1000;
	int creditAmt = 0;

	void debitAmount(int amt) {
		if (amt <= balance) {
			balance = balance - amt;
			debitCount++;

		} else {
			System.out.println("Insufficient fund ");
		}
	}

	void credit(int creditAmt) {
		balance = balance + creditAmt;
		count++;
	}

	void printInfo() {
		System.out.println("Current Balance is" + balance);
		System.out.println("Total debit count is " + debitCount);
		System.out.println("Total credits operations " + count);
	}

	public static void main(String[] args) {
		BankDetails b = new BankDetails();
		b.debitAmount(200);
		b.credit(400);
		b.printInfo();

	}
}