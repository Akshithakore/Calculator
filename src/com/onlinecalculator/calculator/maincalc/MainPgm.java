package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
	int type;
	type=disp();
       
	if(type==1)
	{
		BasicCalc cal=new BasicCalc();
		cal.menu();
		cal.userInputs();
		cal.performOperation();
	}
	
	if(type==2)
	{
		ScientificCalc cal=new ScientificCalc();
		cal.menu();
		cal.userInputs();
		cal.performOperation();
	}
	if(type==3)
	{
		StatisticCalc cal=new StatisticCalc();
		cal.menu();
		cal.userInputs();
		cal.performOperation();
	}
	}
static int disp()
{
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("**************CALCULATOR****************");
	System.out.println("**************1.BASIC CALCULATOR****************");
	System.out.println("**************2.SCIENTIFIC CALCULATOR****************");
	System.out.println("**************3.STATISTICAL CALCULATOR****************");
	System.out.println("*******************************************");
	System.out.println("Enter your choice");
	ch=sc.nextInt();
	return(ch);
}
	
}
	