package com.ip.exercise;
 class Player {
	int number = 0;
	
	public void guess() {
		number = (int) (Math.random()*10);
		System.out.println("I am guessing "+number);
	}
}

public class GameLuncher {

	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}

}
