package com.epamwork.calculator;
import java.util.*;
public class KissPrinciple {
	public static double calculation(double n1, int i, double n2) {
		double a[]= {n1+n2,n1-n2,n1*n2,n1/n2};
		return a[i-1];
	}
	public static void min(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
                System.out.println("Select an option:\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
		int cal =sc.nextInt();
		System.out.println(calculation(num1, cal, num2));
		
	}
	
}
