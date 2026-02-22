package basic;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int no1 =sc.nextInt();
		if (no1>0) {
			System.out.println("Number"+no1+" is positive");
		}
		else if (no1<0) {
			System.out.println("Number"+no1+" is negative");
		}
		else {
			System.out.println("Number is 0");
		}
	}
}
