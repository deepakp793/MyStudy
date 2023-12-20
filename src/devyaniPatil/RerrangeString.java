package devyaniPatil;

/*Assignment - 18 :
1) Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter*/

class RerrangeString {

	String AllDigitAllCharacter(String input) {
		String tempDigit = "";
		String tempLetter = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				tempLetter = tempLetter + ch;
			} else if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;

			}
		}
		return tempDigit + tempLetter;
	}

	public static void main(String[] args) {
		RerrangeString r = new RerrangeString();
		String output = r.AllDigitAllCharacter("te2cH4no");
		System.out.println(output);
	}
}
