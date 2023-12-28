package devyaniPatil.ArrayExample;
/*Assignment - 20 : 

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)*/


class SumOfAllNotPrimeNumber{
 
	boolean isNotPrime(int num){
		boolean status = false; 
		for (int index=2; index <= num/2;index++){
			if(num % index ==0){
				status = true;
				break;
		     }
	    }
		return status;  
  }
  
	int getSumOfNotPrimeNo(int []arr){
		int sum = 0;
		for(int index = 0; index < arr.length; index++){
			if(isNotPrime(arr[index])){
				sum=sum+arr[index];
	        }  
        }
		return sum;
  }
  public static void main (String[]args){
	  SumOfAllNotPrimeNumber sum = new SumOfAllNotPrimeNumber();
	  int [] num = {11,13,17,22,44};
	  int ans = sum.getSumOfNotPrimeNo(num);
	  System.out.println("Sum of the NotPrimeNoInarray: " + ans);
  }
}

