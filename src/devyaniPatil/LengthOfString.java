package devyaniPatil;
/*Assignment - 16 : 6th Sep'2022

 1. write a method to return length of the given name
int getNameLength(String name)*/

class LengthOfString {

	int getNameLength(String name) {
		return name.length();
	}

	public static void main(String[] args) {
		String str = "Adiii";
		System.out.println("Length of string is " + str.length());
	}
}