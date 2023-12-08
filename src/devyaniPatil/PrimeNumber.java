package devyaniPatil;
/*Assignment - 8 & 9 : 
Write a program to find if a given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number*/

class PrimeNumber {

	boolean status = true;

	void isPrime(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = false;
				System.out.println(num + "is not a prime number");
				break;
			}
			if (status == true) {
				System.out.println(num + "is a prime number");
				break;
			}
		}
		if (num < 0) {
			System.out.println(num + " is not a valid number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.isPrime(-12);

	}
}
