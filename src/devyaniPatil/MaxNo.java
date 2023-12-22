package devyaniPatil;
/*Assignment - 19 :
3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55*/

class MaxNo {

	int getMaxNo(int[] arr) {
		int max = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNo m = new MaxNo();
		int[] num = { 11, 4, 55, 23, 43 };
		int ans = m.getMaxNo(num);
		System.out.println("Maximun No is: " + ans);

	}
}