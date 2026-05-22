package com.javaintro;

public class Student {
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

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.sid = 1;
		s1.sname = "Mani";
		s2.sid = 2;
		s2.sname = "Lasya";
		s3.sid = 3;
		s3.sname = "Suma";
		
		s1.display();
	    s2.display();
		s3.display();
		s2 = null; //nullifying the object
		System.gc();
		System.out.println(s1);
		System.out.println(s2);

	}

}
