package deepakPatil;

class StaticExample2{
	 int num1=1;
	 int num2=2;
	 static int num3=5;
	 
	 void processData(){
		 num1=num2;
		 num3=num3+num1+num2;
	 }
	 void display(){
		 System.out.println(num3);
	 }
	 public static void main (String[]args){
		 StaticExample2 staticexample21=new StaticExample2();
		 staticexample21.processData();
		 staticexample21.display();
		 
		 StaticExample2 staticexample22=new StaticExample2();
		 staticexample22.processData();
		 staticexample22.display();
	 }
}