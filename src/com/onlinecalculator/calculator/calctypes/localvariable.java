package com.onlinecalculator.calculator.calctypes;
import java.util.*;

class abc{
	void display(){
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter any number");
		x=s.nextInt();
		System.out.println("local Variable X="+ x);
	}
}
public class localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc s=new abc();
		s.display();
	}

}
