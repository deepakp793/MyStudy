package devyaniPatil.StringExample;
/*Assignment - 18 :
2) Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)
*/

class rearrangeString1 {

	String AllDigitAllCharacter(String input) {
		String tempUppercaseLetter = "";
		String tempDigits = "";
		String tempLowerCaseLetter = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				tempUppercaseLetter = tempUppercaseLetter + ch;
			} else if (Character.isDigit(ch)) {
				tempDigits = tempDigits + ch;
			} else if (Character.isLowerCase(ch)) {
				tempLowerCaseLetter = tempLowerCaseLetter + ch;
			}
		}
		return tempUppercaseLetter + tempDigits + tempLowerCaseLetter;
	}

	public static void main(String[] args) {
		rearrangeString1 string = new rearrangeString1();
		String output = string.AllDigitAllCharacter("t8EcHNo5Cred3iTs");
		System.out.println(output);
	}
}
