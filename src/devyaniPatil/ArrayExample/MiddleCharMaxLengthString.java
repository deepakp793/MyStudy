package devyaniPatil.ArrayExample;
/*Test - 3 : 
Program 1 : 
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/

class MiddleCharMaxLengthString{
	
	char getmaxLengthChar(String[] name){
	   int maxLength = 0;
	   String maxLengthName = "";
	   for(int index = 0; index < name.length; index++){
			if(maxLength <= name[index].length()){
			  maxLength = name [index].length();	
			  maxLengthName = name [index];
			}
	   }
		
		char middleChar;
	    if (maxLengthName.length() % 2 == 0) {
            int middleIndex = maxLengthName.length() / 2 - 1;
            middleChar = maxLengthName.charAt(middleIndex);
        } else {
            int middleIndex = maxLengthName.length() / 2;
            middleChar = maxLengthName.charAt(middleIndex);
        }
        return middleChar;
    }

	 public static void main(String[]args){
		 MiddleCharMaxLengthString  middlemaxlength = new MiddleCharMaxLengthString();
		 String[] input = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		 char middleChar = middlemaxlength.getmaxLengthChar(input);
		 System.out.println(middleChar);
    }
}

