package com.bridgelab.day5;

import java.util.Scanner;

public class Hrmonicnum {
	public static void main(String args[]) {
		Scanner N = new Scanner(System.in);
		System.out.println("Generates Harmonic Series");
		System.out.print("Enter Number: ");
		int number = N.nextInt();
		int temp = number;
		double sum = 0;
		while (temp > 0) {
			sum = sum + ((double) 1 / (double) temp);
			temp--;
		}
		System.out.println("Harmonic Series Output for Number '" + number + "': " + sum);

	}
}
