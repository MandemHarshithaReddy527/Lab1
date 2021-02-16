package org;

import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,b;
		System.out.println("Enter n value: ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextDouble();
	
		while(n%2==0) {
			n=n/2;
		}
		System.out.println(n==1);
	}
}
