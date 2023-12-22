package devyaniPatil;
/*Assignment - 19 
4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4*/

class MinNo {

	int getMinNo(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (min > arr[index]) {
				min = arr[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MinNo s = new MinNo();
		int[] num = { 11, 4, 55, 23, 43 };
		int ans = s.getMinNo(num);
		System.out.println("Minimum no is: " + ans);

	}
}