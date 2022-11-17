package com.bridgelab.day5;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {
	public static void main(String[] args) {

	public String chanceFunc() {
		Random r = new Random();
		int chance = r.nextInt(2);
		if (chance == 1) {
			return "tails";
		} else {
			return "heads";
		}
	}
}
