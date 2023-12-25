package devyaniPatil;
/*Assignment - 2 :  
Calculator program using Parameterized method.*/

class CalculatorParameterized {
	void add(int number1, int number2) {
		int ans = number1 + number2;
		System.out.println("The addition is " + ans);
	}

	void sub(int number1, int number2) {
		int ans = number1 - number2;
		System.out.println("The substraction is " + ans);
	}

	void mul(int number1, int number2) {
		int ans = number1 * number2;
		System.out.println("The multiplication is " + ans);
	}

	void div(int number1, int number2) {
		int ans = number1 / number2;
		System.out.println("The division is " + ans);
	}

	public static void main(String[] args) {
		CalculatorParameterized cal = new CalculatorParameterized();
		cal.add(12, 14);
		cal.sub(8, 5);
		cal.mul(7, 2);
		cal.div(10, 5);

	}
}