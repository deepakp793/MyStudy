package devyaniPatil.ArrayExample;
/*Assignment - 20 :
6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3 */
		 		
class CountOfVowelsInArray{
	
	void countOfVowels(String[] names){
			for(int index = 0; index<names.length ;index++){
				String str = names[index].toLowerCase();
				int vowelCount=0;
			
				for(int index1 = 0; index1 < str.length(); index1++){
					char ch = str.charAt(index1);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						vowelCount++; 
					}
				}
				System.out.println(names[index] + " -> " + vowelCount);
			}
    }
	public static void main(String[] args) {
        CountOfVowelsInArray vowelsCounter = new CountOfVowelsInArray();
        String[] namesArray = {"Ashish", "Aditty", "Manjiri", "Ankita"};
        vowelsCounter.countOfVowels(namesArray);
    }
}



