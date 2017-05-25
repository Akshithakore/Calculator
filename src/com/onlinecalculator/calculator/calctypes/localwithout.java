package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

 public class localwithout {
	 static void display(){
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter any number");
		x=s.nextInt();
		System.out.println("local Variable X="+ x);
	}


	public static void main(String[] args) {
		
display();
	}

}
