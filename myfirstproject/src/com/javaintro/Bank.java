package com.javaintro;

public class Bank {
		static int serial=1235760;
		 int accNo,balance;
		 String mobile;
		 String name;
		 {
			serial++;
			accNo=serial;
		
		 }
	    void display()
		 {
			 System.out.println("accNo="+accNo);
			 System.out.println("name="+name);
			 System.out.println("balance="+balance);
			 System.out.println("mobile="+mobile);
		 }
		 
	     public static void main(String[] args) {
			Bank b1=new Bank();
			b1.name="Srinu";
			b1.balance=1000;
			b1.mobile="9347568580";
			Bank b2=new Bank();
			b2.name="Raghu";
			b2.balance=3000;
			b2.mobile="7386529139";
			Bank b3=new Bank();
			b3.name="Madhavi";
			b3.balance=5000;
			b3.mobile="9912946002";
		
			
		 b1.display();
		 System.out.println("---------------");
	  	 b2.display();
	 	 System.out.println("---------------");
	     b3.display();
		 System.out.println("---------------");
		}

	}

