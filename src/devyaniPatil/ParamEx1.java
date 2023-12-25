package devyaniPatil;

class ParamEx1 {
	String name;
	int rno;

	void setData(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}

	void display() {
		System.out.println("Student name is" + name);
		System.out.println("Student rno is" + rno);

	}

	public static void main(String[] args) {
		ParamEx1 paramEx1 = new ParamEx1();
		paramEx1.setData("Adiii", 3);
		paramEx1.display();
	}
}