package com.javaintro;

public class Student3 {
	protected void finalize() {
		System.out.println("object destroyed");
	}

	int sid;
	String sname;
	Student3 m;

	void display() {
		System.out.println(sid);
		System.out.println(sname);
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();
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
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1.m = s2;
		s2.m = s1;
		s3.m = s1;
		s1=null;
		s2=null;
		s3=null;
System.out.println("------------------------------------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.gc();

	}

}
