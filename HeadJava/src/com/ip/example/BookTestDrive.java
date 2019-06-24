package com.ip.example;

class Book1{
	String title;
	String author;
	
}

public class BookTestDrive {

	public static void main(String[] args) {
		Book1[] myBook=new Book1[3];
		myBook[0]=new Book1();
		myBook[1]=new Book1();
		myBook[2]=new Book1();
		myBook[0].title="the java";
		myBook[1].title="the java cookbook";
		myBook[2].title="the java Coding";
		myBook[0].author="bob";
		myBook[1].author="sue";
		myBook[2].author="Kumar";
		 
	
		int x=0;
		while(x<3){
			System.out.println(myBook[x].title);
			System.out.println(myBook[x].author);
			x=x+1;
		}
	}
	
	}


