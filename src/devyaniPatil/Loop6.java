package devyaniPatil;
class Loop6{
	void m1(){
		//int count = 0;
		 for(int i=1;i<=100;i++){ 
		 if(i%7==0 && i%13==0){
		 System.out.println(i+ " divisible by 7 and 13");
		   }
		    else if(i%7==0 )
			System.out.println(i+ " divisible by 7");
	        else if(i%13==0)
			   System.out.println(i+ " divisible by 13");
		    
	      
       }
    }
	public static void main(String[]args){
		Loop6 loop6=new Loop6();
		loop6.m1();
		
	}
}