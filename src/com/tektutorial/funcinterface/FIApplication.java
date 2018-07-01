package com.tektutorial.funcinterface;

public class FIApplication {

	public static void main(String[] args) {
		Test test = new Test();
		int x = 10;
		Square obj = (int y) -> x * x;
		System.out.println(obj.doSquare(x));

		System.out.println(test.sayHello(x, (value) -> value * value));
	}

}

class Test {
	public int sayHello(int num, Square sqaure) {
		return sqaure.doSquare(num);
	}
}
