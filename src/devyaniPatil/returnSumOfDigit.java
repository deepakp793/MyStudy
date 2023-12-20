package devyaniPatil;
/*Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'*/


class returnSumOfDigit{

	int getDigitSum(String input){
	     int digitSum = 0;
	        for(int index=0;index<input.length();index++){
	          char ch=input.charAt(index);
	          if(Character.isDigit(ch)){
                 digitSum = digitSum + Character.getNumericValue(ch);				  
		       }
	        }
	       return digitSum;
        }
  public static void main(String[]args){
	  returnSumOfDigit r=new returnSumOfDigit();
	  int digitSum=r.getDigitSum("Te8chno3cred7it9s");
	  System.out.println(digitSum);
	  
  }

 }
