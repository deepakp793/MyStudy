package devyaniPatil;
class Loopex3{
	void processData(int startno,int endno){
		
		for( int num = startno; num<=endno;num++){
			int count = 0;
			if(num%3 == 0 && num%7 == 0){
				count++;
				
			}
			System.out.println(num);
		}
		
	}
 	public static void main(String[]args){
		Loopex3 loopex3 = new Loopex3();
		loopex3.processData(1,100);
	}
}