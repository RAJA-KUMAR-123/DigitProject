package com.digit.javaTraining.ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH_Ques1 {
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the no");
	    System.out.println("enter the nomenator");
	    int nomi=sc.nextInt();
	    System.out.println("enter the demo");
	    int demo = sc.nextInt();
	    
	    int res=nomi/demo;
	    
	    System.out.println("the res is :"+ res);
	    
	    
	    System.out.println("enter the total no of array");
	    Scanner sc1 = new Scanner(System.in);
	    int n=sc1.nextInt();
	    int arr[]=new int[n];
	    System.out.println("enter the array");
	    int posi =sc1.nextInt() ;
	    System.out.println("enter the index val");
	    int val = sc1.nextInt();
	    
	     arr[posi]=val;
		    System.out.println("array val is added....");




		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(NegativeArraySizeException e2) {
			System.out.println(e2);
		}
		catch( ArrayIndexOutOfBoundsException e3) {
			System.out.println(e3);
		}
		catch(InputMismatchException e4) {
			System.out.println(e4);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	    
	}

}
