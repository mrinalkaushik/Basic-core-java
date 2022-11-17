package com.bridgelab.day5;

public class Swapnum {

	public static void main(String[] args) {
		float N1 = 19.5F, N2 = 16.7F;
		System.out.println("before swapingN1,N2");
		System.out.println("N1:" + N1);
		System.out.println("N2:" + N2);
		N1 = N1 - N2;
		N2 = N1 + N2;
		N1 = N2 - N1;
		System.out.println("AFTER swapingN1,N2");
		System.out.println("N1:" + N1);
		System.out.println("N2:" + N2);

	}

}
