package devyaniPatil;
/*Assignment - 19 : 

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36
*/

class SumOfArray {

	int add(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfArray s = new SumOfArray();
		int[] num = { 10, 11, 15 };
		int ans = s.add(num);
     	System.out.println("Sum of all numbers in given array is : " + ans);
	}
}
