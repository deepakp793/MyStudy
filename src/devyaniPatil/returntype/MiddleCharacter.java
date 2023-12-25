package devyaniPatil.returntype;
/*2. return middle character from given name.
 Hint : char getMiddleChar(String name)
this code is for evenstring*/

class MiddleCharacter {

 char m1(String str) {
	 int length = str.length();
	 int index = 0;
	 if (length % 2 == 0) {
		index = length / 2 - 1;
	  } else {
			index = length / 2;
		  }
		return str.charAt(index);
	 }

	public static void main(String[] args) {
		String str;
		str = "technocredits";
		char ch = str.charAt(6);
		System.out.println("Middle Character of String is " + ch);
	}
}
