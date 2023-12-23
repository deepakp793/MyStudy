package devyaniPatil;
/*Assignment - 17 : 

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4*/

class CountOfDigit {

	int getCount(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CountOfDigit counter = new CountOfDigit();
		int result = counter.getCount("Te8chno3cred7it9s");
		System.out.println("Count of digits: " + result);
	}
}
