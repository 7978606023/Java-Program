package com.ip.example;


public class SimpleDotComeTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations= {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess="2";
		
		String result=dot.checkYourself(userGuess);
	}
}
class SimpleDotCom{
	int[] locationcells;
	int numOfHits = 0;
	public void setLocationCells(int[] locs) {
		locationcells = locs;
	}
	
	public String checkYourself(String userGuess) {
		int guess=Integer.parseInt(stringGuess){
			String result="miss";
			for(int cell:locationcells)
					if(guess == cell) {
						result = "hit";
						numOfHits++;
						break;
					}
			}
		if(numOfHits==locationcells.length) {
			result="kill";
			
		}
		System.out.println(result);
		return result;
	}
}
	