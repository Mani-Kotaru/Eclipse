package com.javaintro;

public class Demo2 {
	int sid;
	String sname;
	void display(int id,String name)
	{
		sid=id;
		sname=name;
		System.out.println(sid+" "+sname);
	}
   public static void main(String args[]){
     Demo2 s1=new Demo2();
     s1.display(573,"Mani");
  }
}
