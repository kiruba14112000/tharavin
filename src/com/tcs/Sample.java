package com.tcs;

public class Sample {

	public void test() {
		System.out.println("abc");
	}

	public void test2() {
		System.out.println("abc1");
	}

	public void test3() {
		System.out.println("abc2");
	}

	private void test4() {
		System.out.println("abc3");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.test();
		s.test2();
		s.test3();
		s.test4();

	}

}
