package devyaniPatil;
class PN{
	void isPrime(int num){
		boolean status = true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				status=false;
				System.out.println("number is not prime");	
			}
		}if(status==true){
				System.out.println("number is prime");
			}
	}
	public static void main(String[]args){
		PN pn = new PN();
		pn.isPrime(9);
	}
}