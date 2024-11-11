package devyaniPatil;
class Loopex3{
	void processData(int startno,int endno){
		int count = 0;
		for( int num = startno; num<=endno;num++){
			if(num%3 == 0 && num%7 == 0){
				count++;
				System.out.println(num);
				if(count==3) {
					break;
				}
			}
			
		}
		System.out.println(count);
		
	}
	
	
	
 	public static void main(String[]args){
		Loopex3 loopex3 = new Loopex3();
		loopex3.processData(20,100);
	}
}