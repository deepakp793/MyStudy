package devyaniPatil.ArrayExample;
/*Test 4 - 
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
		 
class SumOfDigitInStringArray {
	
	int calculateDigitSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfDigitInStringArray sumCalculator = new SumOfDigitInStringArray();
        String[] inputArray = {"Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul"};

        for (int i = 0, len = inputArray.length; i < len; i++) {
        	 String str = inputArray[i];
			int digitSum = sumCalculator.calculateDigitSum(str);
            System.out.println(str + " -> " + digitSum);
        }
    }
}


