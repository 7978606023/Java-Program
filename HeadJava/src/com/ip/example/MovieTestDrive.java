package com.ip.example;

class Movie{
	String title;
	String genre;
	int rating;
	 
	void playIt() {
		System.out.println("playing the movie");
	}
}

public class MovieTestDrive {

	public static void main(String[] args) {
		Movie one =new Movie();
		one.title="gone with the stock";
		one.genre="tragic";
		one.rating=-2;
		
		Movie two=new Movie();
		two.title="lot in the cubicle space";
		two.genre="comedy";
		two.rating=5;
		two.playIt();
		
		Movie three=new Movie();
		three.title="Byte club";
		three.genre="tragic but ultimately uplifting";
		three.rating=127;

	}

}
