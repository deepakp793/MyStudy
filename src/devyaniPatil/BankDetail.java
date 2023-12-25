package devyaniPatil;

class BankDetail {
	int balance = 1000;
	int debitCount = 0;

	void debitAmt(int amt) {
		if (amt <= 2000) {
			balance = balance - amt;
			debitCount++;

		} else {
			System.out.println("Insufficient fund");
		}
	}

	void printInfo() {
		System.out.println("now your current balance is" + balance);
		System.out.println("Total debit Operation:" + debitCount);

	}

	public static void main(String[] args) {
		BankDetail bankdetail = new BankDetail();
		bankdetail.printInfo();
		bankdetail.debitAmt(266);
	}
}