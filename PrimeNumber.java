package org;

import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int N=sc.nextInt();
	for(int m=1;m<=N;m++) {
		int k=0;
        for(int n=1;n<=m;n++) {
        	if(m%n==0)
        		k++;
            
        }
        if(k==2)
			System.out.print(" "+m);
		}
	}
}
		// TODO Auto-generated method stub