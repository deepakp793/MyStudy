package devyaniPatil;

class Calculator {
	int number1 = 10;
	int number2 = 5;

	void add() {
		int ans = number1 + number2;
		System.out.println("The addition is " + ans);
	}

	void sub() {
		int ans = number1 - number2;
		System.out.println("The substraction is " + ans);
	}

	void mul() {
		int ans = number1 * number2;
		System.out.println("The multiplication is " + ans);
	}

	void div() {
		int ans = number1 / number2;
		System.out.println("The division is " + ans);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();

	}
}