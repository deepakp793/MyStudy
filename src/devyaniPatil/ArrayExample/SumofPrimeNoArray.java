package devyaniPatil.ArrayExample;
/*Assignment - 19 :
2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)*/

class SumofPrimeNoArray {

	boolean isPrime(int num) {
		boolean status = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	int getSumOfPrimeNo(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (isPrime(arr[index])) {
				sum = sum + arr[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumofPrimeNoArray Sum = new SumofPrimeNoArray();
		int[] num = { 11, 14, 17, 22, 44 };
		int ans = Sum.getSumOfPrimeNo(num);
		System.out.println("Sum of the Prime No array: " + ans);
	}
}