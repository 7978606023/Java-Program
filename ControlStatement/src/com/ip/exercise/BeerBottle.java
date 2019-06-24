package com.ip.exercise;

public class BeerBottle {
	public static void BeerSong(int beer) {
		if (beer > 0) {
			System.out.print(beer + " bottles of beer on the wall, ");
			System.out.print(beer + " bottles of beer, ya' take one down, ya' pass it around, ");
			System.out.println(beer - 1 + " bottles of beer on the wall.");
			BeerSong(beer - 1);
		} else {
			System.out.println(
					"No bottles of beer on the wall, no bottles of beer, ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
		}
	}

	public static void main(String[] args) {
		BeerSong(99);
	}
}
