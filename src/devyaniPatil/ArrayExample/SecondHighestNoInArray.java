package devyaniPatil.ArrayExample;
/*Assignment - 21 : 

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/


class SecondHighestNoInArray {

    int secondHighestNo(int[] input) {
        int maxNo = 0;
        int secondMaxNo = 1;

        for (int index = 0; index < input.length; index++) {
            int number = input[index];
            if (number > maxNo) {
                secondMaxNo = maxNo;
                maxNo = number;
            } else if (number > secondMaxNo && number != maxNo) {
                secondMaxNo = number;
            }
        }

        return secondMaxNo;
    }

    public static void main(String[] args) {
        SecondHighestNoInArray finder = new SecondHighestNoInArray();
        int[] inputArray = {10, 99, 33, 44, 89, 76};
        int result = finder.secondHighestNo(inputArray);

        System.out.println("The second highest number is: " + result);
    }
}
