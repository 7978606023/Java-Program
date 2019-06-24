package com.ip.example;

public class TapdeckTestDrive {
boolean canRecord = false;
void playTape() {
	System.out.println("tape playing");
}

void recordTape() {
	System.out.println("tape recording");
}
}
 class TapedeckTestDrive{
	 public static void main(String args[])
	 {
		 TapdeckTestDrive t=new TapdeckTestDrive();
		 t.canRecord=true;
		 t.playTape();
		 
		 if(t.canRecord==true) {
			 t.recordTape();
			 
		 }
	 }
 }
