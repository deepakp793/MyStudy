package devyaniPatil;
class LoopEx1{
	
		void printName(String name,int n){
		for(int index=1;index<=7;index++){
			System.out.println(name+" "+index);
		}
		}
		public static void main (String []args){
			LoopEx1 loopex1=new LoopEx1();
			loopex1.printName("devyani",7);
		}
}