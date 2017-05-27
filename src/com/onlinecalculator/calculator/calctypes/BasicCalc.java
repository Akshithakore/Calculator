package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class BasicCalc1
{
	int a,b,c,ch,res;
	
	public BasicCalc1()
        {
		a=0;
		b=0;
		c=0;
		res=0; 
		
		
	}
	
	public int menu()
        {
		System.out.println("select option ");
		System.out.println("1.Addition ");
		System.out.println("2.Substration");
		System.out.println("3.division ");
		System.out.println("4.division");
		System.out.println("******************* ");
		System.out.println("enter your choice ");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return(0);
		
		
    	
	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter 1st num ");
    	a=s.nextInt();
    	System.out.println("enter 2nd num");
    	b=s.nextInt();
    	
    	
    	
    	
    	
    }

    public void performOperation()
{
    	switch(ch)
    	{
    	case 1:System.out.println("addition");
    	res=add();
    	System.out.println(res);
    	break;
    	case 2:System.out.println("subtration");
    	res=subtract();
    	System.out.println(res);
    	break;
    	case 3:System.out.println("multiplication");
    	res=multiply();
    	System.out.println(res);
    	break;
    	case 4:System.out.println("division");
    	res=divide();
    	System.out.println(res);
    	break;
    	default:System.out.println("invalid option" );
    		
    	
    	
    	
    		
    	
    	
        }
       
    }
    
	int add()
	{
		c=a+b;
		return(c);
	}
	
	int subtract()
	{
		c=a-b;
		return(c);
	}
	
	int multiply()
	{
		c=a*b;
		return(c);
	}
	
	int divide()
	{
		c=a/b;
		return(c);
	}
	
}
public class BasicCalc
{
	public static void main(String args[])
	{
		BasicCalc1 c=new BasicCalc1();
		c.menu();
		c.userInputs();
		c.performOperation();
	}
}