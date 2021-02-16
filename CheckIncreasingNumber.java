package org;

import java.util.Scanner;
public class CheckIncreasingNumber {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(checkNumber(a));
    }
    public static boolean checkNumber(int a) {
    	int n=10,r;
        while(a!=0) {
        	r=a%10;
            a=a/10;
            if(r>n) {
            	return false;
            }
            n=r;
        }
        return true;
    }
}