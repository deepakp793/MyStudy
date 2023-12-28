package devyaniPatil.ArrayExample;
/*Assignment - 20 : 
2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)*/

class SumOfAllNotPrimeNumber1{
 
	boolean isNotPrime(int num){
		boolean status = false; 
		for (int index=2; index <= num/2;index++){
			if(num % index ==0){
				status = true;
				break;
		    }	
	    }
		return status ;
  }
	int getSumOfNotPrimeNo(int []arr){
		int sum = 0;
		for(int index = 0; index < arr.length; index++){
			if(isNotPrime(arr[index])&& arr[index] % 5 == 0 && arr[index] % 7 == 0){
				sum=sum+arr[index];
	        }  
        }
		return sum;
  }
  public static void main (String[]args){
  SumOfAllNotPrimeNumber1 S=new SumOfAllNotPrimeNumber1();
  int [] num={11,35,17,105,44};
  int ans=S.getSumOfNotPrimeNo(num);
  System.out.println("Sum of the NotPrimeNoInarray: " + ans);
  }
}

