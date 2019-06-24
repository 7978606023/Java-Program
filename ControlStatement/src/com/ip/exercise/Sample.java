package com.ip.exercise;

class Movie{
	String title;
	int price;
	double ratings;
	 
	void display() {
		System.out.println(title+" "+price+" "+ratings);
	}
}

public class Sample {

	public static void main(String[] args) {
	
		Movie one = new Movie();
		one.title = "kite";
		one.price = 120000;
		one.ratings = 4.5;
		one.display();
		
		Movie two = new Movie();
		two.title = "sholay";
		two.price = 30000;
		two.ratings = 5.5;
		two.display();
	}
}
