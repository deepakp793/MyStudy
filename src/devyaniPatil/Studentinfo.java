package devyaniPatil;
//Assignment:5(StudentInfo)

class Studentinfo{

	String name="Shikha";
	String midddlename="Amit";
	String surname="Patel";
	String birthdate="10th Aug 1998";
	String address="G-809, Heaven Apartment,Baner,pune";
	int rollno=34;
	
	void studentName(){
		System.out.println(name);
		System.out.println(midddlename);
		System.out.println(surname);	
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	public static void main(String[]args)
	{
		Studentinfo studentinfo=new Studentinfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}
