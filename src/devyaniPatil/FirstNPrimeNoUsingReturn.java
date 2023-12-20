package devyaniPatil;
/*Assignment - 15 : 

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28

-----------------------------*/

class FirstNPrimeNoUsingReturn {

    boolean isPrimeNum(int num) {
        boolean isPrimeFlag = true;
        for (int index = 2; index <= num / 2; index++) {
            if (num % index == 0) {
                isPrimeFlag = false;
                break;
            }
        }
        return isPrimeFlag;
    }
	
      int sumOfFirstNPrimeNumber(int n) {
        int count = 0;
        int num = 2;
        int sum = 0;
        while (count < n) {
            if (isPrimeNum(num)) {
                sum = sum + num;
                count++;
            }
            num++;
        }
        return sum;
    }
    public static void main(String[] args) {
        FirstNPrimeNoUsingReturn F = new FirstNPrimeNoUsingReturn();
        int n = F.sumOfFirstNPrimeNumber(5);
        System.out.println("Sum of first 5 prime numbers: " + n);
    }
}
