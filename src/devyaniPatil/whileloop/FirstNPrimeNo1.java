package devyaniPatil.whileloop;
/*Assignment - 14 : 
Using While loop
Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11*/

class FirstNPrimeNo1 {

	void firstNPrimeNo(int n) {
		int count = 0;
		int num = 2;
		while (count < n) {
			boolean isPrime = true;
			if (num >= 2) {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			} else {
				isPrime = false;
			}
			if (isPrime) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		FirstNPrimeNo1 prime = new FirstNPrimeNo1();
		prime.firstNPrimeNo(5);
	}
}