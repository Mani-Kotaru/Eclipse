package com.javaintro;

public class Student1 {
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
				Student1 s1 = new Student1();
				Student1 s2 = new Student1();
				Student1 s3 = new Student1();
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
				 s1=s2;
				 s1=s3;
				 s1=s2;     //Reassignment
				 s1.display();
				 s2.display();
	            System.out.println(s1);
	            System.out.println(s2);
	            System.out.println(s3);
	           
				System.gc();

			}

		}


	
