package org;

import java.util.Scanner;

public class SumOfCubes {
	int j;
	int sum=0;
	public int cubes() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
			sum=sum+(j*j*j);
		}
		System.out.println(sum);
		return n;
	}
	public static void main(String args[]) {
		SumOfCubes sc=new SumOfCubes();
		sc.cubes();
	}
}