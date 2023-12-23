package devyaniPatil;
/*Assignment - 17 : 

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM*/

class ReverseName {

	String reverseName(String name){
		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	public static void main(String[] args) {
		ReverseName r = new ReverseName();
		String output = r.reverseName("Maulik");
		System.out.println(output);
	}
}
