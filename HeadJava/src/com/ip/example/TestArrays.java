package com.ip.example;

public class TestArrays {

	public static void main(String[] args) {
		int[] index=new int[4];
		index[0]=1;
		index[1]=3;
		index[2]=0;
		index[3]=2;
		String [] island=new String[4];
		island[0]="Bermuda";
		island[1]="fizi";
		island[2]="aores";
		island[3]="cozumel";
		int y=0;
		int ref;
		while(y<4) {
			ref=index[y];
			System.out.println("island= ");
			System.out.println(island[ref]);
			y=y+1;
		}

	}

}
