package devyaniPatil;

/*Assignment - 10 : 
Find the last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
         168
         147 */
class LastThreeNo {
	void noDivisibleBy3and7(int endindex, int startindex) {
		int count = 0;
		for (int i = endindex; i >= startindex; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("number is" + i);
				count++;
			}
			if (count == 3) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		LastThreeNo number = new LastThreeNo();
		number.noDivisibleBy3and7(200, 10);
	}
}
