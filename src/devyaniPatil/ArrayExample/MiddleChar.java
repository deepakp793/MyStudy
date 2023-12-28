package devyaniPatil.ArrayExample;
/*Test - 3 
Program 2: 
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/
			  			  
class MiddleChar {
   
    char getMiddleCharFromName(String name) {
        char ch = ' ';

        if (name.length() % 2 == 0)
            ch = name.charAt(name.length() / 2 - 1);
        else 
            ch = name.charAt(name.length() / 2);

        return ch;
    }

    public static void main(String[] args) {
        MiddleChar middleChar = new MiddleChar();
        String[] input = {"Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul"};
        
        for (int index = 0; index < input.length; index++) {
            System.out.println(input[index] + " -> " + middleChar.getMiddleCharFromName(input[index]));
        }
    }
}
