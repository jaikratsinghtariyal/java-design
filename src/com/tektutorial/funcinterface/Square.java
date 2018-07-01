package com.tektutorial.funcinterface;

@FunctionalInterface
public interface Square {

	int doSquare(int number);	
	
	public default void toStringe() {
		System.out.println("hello");
	}
	
	public static void toStringf() {
		System.out.println("hello");
	}
	
	abstract String toString() ;
}
