package devyaniPatil;
/*Assignment - 12 : 

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within the same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/

class PrimeNumberWithMethods {
	int primeCount = 0;
	int primeSum = 0;
	int primeAvg = 0;

	void isPrime(int num) {
		boolean status = true;
		for (int index = 2; index <= num / 2; index++)
			if (num % index == 0) {
				status = false;
				break;
			}
		if (status == true) {
			System.out.println(num + "is a prime number");
			primeCount++;
			primeSum = primeSum + num;
			primeAvg = primeSum / primeCount;
		}
	}

	void printAllPrime(int startNum, int endNum) {
		for (int num = startNum; num <= endNum; num++) {
			isPrime(num);
		}
		System.out.println("Total prime Number within range is(" + startNum + "," + endNum + ") are " + primeCount);
		System.out.println("Sum of all the prime number is" + primeSum);
		System.out.println("Avg of all the prime number is" + primeAvg);

	}

	public static void main(String[] args) {
		PrimeNumberWithMethods P = new PrimeNumberWithMethods();
		P.printAllPrime(100, 120);
	}

}
