package com.theinnovationinc.regularinnerclass;

public class A {

	private int y = 20;

	public void ab() {
		System.out.println("A class ab method");
	}

	class B {

		final static int x = 20;

		public void ab() {
			System.out.println("B class ab method." + y);
		}

		public void helloMethod() {
			System.out.println("WElcome to hello method.");
		}
	}

	public static void main(String[] args) {

		A a = new A();
		B b = a.new B();
		b.helloMethod();
		b.ab();
		// new A().new B().helloMethod();

	}
}
