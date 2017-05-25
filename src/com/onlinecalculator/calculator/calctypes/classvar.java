package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;


 class classvarone {

	static  int x;
      void display()
      {
    	  x=15;
    	  Scanner sc=new Scanner(System.in);
    	  
    	 System.out.println("instance variable of x is.."+x);
      }
 }
      public class classvar
      {
      public static void main(String args[])
      {
    	  classvarone s=new classvarone();
    	  s.display();
      }
	}


