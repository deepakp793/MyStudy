package deepakPatil;

class StudentDetails{
		String name="SudhaMurti";
		int age=55;
		
		void display(){
			System.out.println(name);
			System.out.println(age);
			
		}
		void update(){
			name="Aadi";
			age=1;
		}
		public static void main (String[]args){
			StudentDetails s1=new StudentDetails();
			s1.display();
			s1.update();
			s1.display();
		}
}

