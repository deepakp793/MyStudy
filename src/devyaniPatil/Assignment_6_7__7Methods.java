package devyaniPatil;
/*Assignment - 6 & 7 
Write only one program having the following methods. [7 methods in same program] 

1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user defined range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11*/

class Assignment_6_7__7Methods {
	int Sum;
	int count;
	int evensum;
	int oddsum;

	void even(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number is" + i);
			}
		}

	}

	void numberDivisibleBy5(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0) {
				System.out.println("The Number Which is Divisible by 5 is" + i);
			}
		}
	}

	void numberDivisibleBy5and3(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Divisible by 5 and 3 , numbers are:" + i);
			}
		}
	}

	void numberDivisibleBy7Or13(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0 || i % 13 == 0) {
				System.out.println("Divisible by 7 or 13, numbers are:" + i);
			}
		}
	}

	void sumOfAllTheNumber(int startIndex, int endIndex) {

		for (int i = startIndex; i <= endIndex; i++) {
			Sum = Sum + i;
		}
		System.out.println("sum of number is:" + Sum);
	}

	void diffOddAndEvenNumber(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;
				;
			} else {
				oddsum = oddsum + i;
			}
		}
		if (evensum > oddsum) {
			int ans = evensum - oddsum;
			System.out.println("difference between sum of odd numbers and even numbers" + ans);
		} else {
			int ans1 = oddsum - evensum;
			System.out.println("difference between sum of odd numbers and even numbers" + ans1);

		}
	}

	void oddReverse(int end, int start) {
		for (int i = end; i >= start; i--) {
			if (i % 2 != 0) {

				System.out.println("odd reverse number is" + i);

			}
		}
	}

	public static void main(String[] args) {
		Assignment_6_7__7Methods A = new Assignment_6_7__7Methods();
		A.even(2, 12);
		A.numberDivisibleBy5(10, 30);
		A.numberDivisibleBy5and3(5, 18);
		A.numberDivisibleBy7Or13(5, 40);
		A.sumOfAllTheNumber(1, 3);
		A.diffOddAndEvenNumber(2, 6);
		A.oddReverse(20, 10);
	}
}