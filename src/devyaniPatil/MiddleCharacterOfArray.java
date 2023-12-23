package devyaniPatil;
/*Assignment - 19 
5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k*/

class MiddleCharacterOfArray {

	void printMiddleCharacter(String[] names) {
		for (int index = 0; index < names.length; index++) {
			String name = names[index];
			int nameLength = name.length();
			char middleChar;

			if (nameLength % 2 == 0) {
				middleChar = name.charAt(nameLength / 2 - 1);
			} else {
				middleChar = name.charAt(nameLength / 2);
			}

			System.out.println(name + " -> " + middleChar);
		}
	}
	
	public static void main(String[] args) {
		MiddleCharacterOfArray m = new MiddleCharacterOfArray();
		String[] names = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		m.printMiddleCharacter(names);
	}
}
