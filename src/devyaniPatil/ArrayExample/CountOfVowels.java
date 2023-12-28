package devyaniPatil.ArrayExample;
/*Assignment - 20 :
5) Return count of vowels in a given String.
input : maulik
output : 3*/

class CountOfVowels {
	
	int vowelsCount(String input) {
        int vowelsCount = 0;
        String str = input.toLowerCase();

        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    public static void main(String[] args) {
        CountOfVowels vowels = new CountOfVowels();
        String input = "Maulik";
        int result = vowels.vowelsCount(input);
        System.out.println("Number of vowels: " + result);
    }
}
