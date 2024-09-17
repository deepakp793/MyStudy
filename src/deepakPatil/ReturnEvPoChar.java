package devyaniPatil;

/*Assignment - 17 : 
Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt*/
class ReturnEvPoChar {

	String evenPosition(String name) {
		String even = "";
		for (int index = 0; index < name.length(); index++) {
			if (index % 2 != 0) {
				even = even + name.charAt(index);
			}
		}
		return even;
	}

	public static void main(String[] args) {
		ReturnEvPoChar r = new ReturnEvPoChar();
		String even = r.evenPosition("technocredits");
		System.out.println("even position characters from given String is --" + even);
	}
}