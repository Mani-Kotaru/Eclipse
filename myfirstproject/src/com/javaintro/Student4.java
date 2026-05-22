package com.javaintro;

public class Student4 {

	int sid;
	String sname;

	@Override
	protected void finalize() {
		System.out.println("Object Destroyed!");
	}

	void display() {
		System.out.println(sid);
		System.out.println(sname);

	}

	void Scope() {
		Student4 s4 = new Student4();
	}

	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		Student4 s3 = new Student4();
		s1.sid = 1;
		s1.sname = "Mani";
		s2.sid = 2;
		s2.sname = "Lasya";
		s3.sid = 3;
		s3.sname = "Suma";

		s1.display();
		s2.display();
		s3.display();
		System.out.println("**********************");
		s1.Scope();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.gc();

	}

}
