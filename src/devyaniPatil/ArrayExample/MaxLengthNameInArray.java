package devyaniPatil.ArrayExample;
/*Assignment - 20 :
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
*/

class MaxLengthNameInArray{
 
	String getmaxLength(String[] name){
		int maxLength = 0;
		String maxLengthName = name[0];
		for(int index = 1; index < name.length; index++){
			if(maxLength <= name[index].length()){
			 maxLength = name [index].length();	
			 maxLengthName = name [index];
			}
		}
		return maxLengthName;
	}
	public static void main (String[]args){
		MaxLengthNameInArray maxname = new MaxLengthNameInArray();
		String[] namesArray = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		String maxLengthName = maxname.getmaxLength(namesArray);
		System.out.println(maxLengthName );  
	}
}