package devyaniPatil;
/*test:2
findRequiredNumbers(50);
input : 50
output : 10*/

class RequiredNumber {

	void findRequiredNumber(int targetNum) {
		int no = 1;
		int count = 0;
		int sum = 0;
		while (sum < targetNum) {
			count++;
			sum = sum + no;
			no++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		RequiredNumber N = new RequiredNumber();
		N.findRequiredNumber(50);
	}
}