package devyaniPatil.ArrayExample;
/*Assignment - 20 :
4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10*/


class DiffEvenNoAndOddNoInArray {

	int getDifference(int[] arr) {
		int sumEven = 0;
        int sumOdd = 0;
        for (int index=0; index<arr.length; index++ ){
        	if (arr[index] % 2 == 0) {
                sumEven = arr[index] + sumEven;
            } else {
                sumOdd = arr[index] + sumOdd;
            }
        }
		int difference;
        if (sumEven > sumOdd) {
            difference = sumEven - sumOdd;
        } else {
            difference = sumOdd - sumEven;
        }
        return difference;  
 }
    public static void main(String[] args) {
		DiffEvenNoAndOddNoInArray  number = new DiffEvenNoAndOddNoInArray();
        int[] inputArray = {10,11,15,6};
        int result = number.getDifference(inputArray);
        System.out.println("The difference is: " + result);
    }
}
