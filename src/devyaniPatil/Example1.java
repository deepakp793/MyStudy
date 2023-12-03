package devyaniPatil;
class Example1{
	int x=10;
	int y=20;
	
	void processData(){
		x=x+10;
		y=y+10;		
	}
	 void display(){
		System.out.println("sum is "+ x+y);
		System.out.println(x+y +"is my answer");
		
	 }
	 
	 public static void main (String []a){
		 Example1 exam=new Example1();
		 exam.processData();
		 exam.display();
		 
	 }
}