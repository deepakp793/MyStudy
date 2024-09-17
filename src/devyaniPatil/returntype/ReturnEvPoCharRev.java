package devyaniPatil.returntype;
/*Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe*/

class ReturnEvPoCharRev {

	String evenPosition(String name) {
		String even = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			if (index % 2 != 0) {
				even = even + name.charAt(index);
			}
		}
		return even;
	}

	public static void main(String[] args) {
		ReturnEvPoCharRev Char = new ReturnEvPoCharRev();
		String even = Char.evenPosition("technocredits");
		System.out.println("even position characters from given String in reverse is  " + even);
	}
}