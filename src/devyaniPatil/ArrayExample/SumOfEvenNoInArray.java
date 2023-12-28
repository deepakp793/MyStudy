package devyaniPatil.ArrayExample;
/*Assignment - 20 
3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16*/

class SumOfEvenNoInArray{

	boolean isEvenNo(int num){
		boolean status=false;
		for(int index=0;index>=0;index++){
			if(num%2==0){
				num++;
				status =true;
			}
		}
		return status;
 }
	int SumOfNumber(int [] arr){
		int sum=0;
		for(int index=0;index<arr.length;index++){
		   if(isEvenNo(arr[index])){
		   sum=sum+arr[index];
		   }
		}
		return sum;   
   }
   public static void main(String[]args){
	   SumOfEvenNoInArray S=new SumOfEvenNoInArray();
	   int []num={10,11,15,6};
	   int output=S.SumOfNumber(num);
	   System.out.println(output);   
   }
 }
