package devyaniPatil;
class Loopex2{
	void processData(int startno,int endno){
		int sum = 0;
		for( int index = startno; index<=endno;index++){
			 sum = sum + index;
		}
		System.out.println("sum of 5 and 2 is "+ sum);
	}
 	public static void main(String[]args){
		Loopex2 loopex2 = new Loopex2();
		loopex2.processData(2,6);
	}
}