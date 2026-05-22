package com.javaintro;

public class Test1 {
	static Test1 t = new Test1();

	@Override
	protected void finalize() {

		System.out.println("object destroyed");
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t = null;
		t1 = null;
		System.gc();

		System.out.println("Good Morning");
	}

}
