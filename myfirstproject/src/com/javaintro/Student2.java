package com.javaintro;

public class Student2 {
	@Override
	protected void finalize()  {
		System.out.println("object destroyed");
	}
	int sid;
	String sname;
	void display() {
		System.out.println(sid);
		System.out.println(sname);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
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
		new Student2(); //Anonymous object
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
       
		System.gc();

	}

}
