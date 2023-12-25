package devyaniPatil.StringExample;
/*Assignment - 18 :
3)Find frequency of given character from given String.

String str = "TechnoTtcredits";
char targetChar = 't';
output : 4*/

class FrequencyOfChar {

	int getCountOfTargetChar(String input, char targetChar) {
		int count = 0;
		input = input.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		FrequencyOfChar freq = new FrequencyOfChar();
		String input = "TechnoTtcredits";
		char targetChar = 'T';
		int getCountOfTargetChar = freq.getCountOfTargetChar(input, targetChar);
		System.out.println(input + " freq of character " + targetChar + " is " + getCountOfTargetChar);
	}
}