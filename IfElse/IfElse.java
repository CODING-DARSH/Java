package IfElse;
import java.util.Scanner;
public class IfElse{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	int no1,no2;
	System.out.println("Enter value of no1:");
	no1=sc.nextInt();
	System.out.println("Enter value of no2:");
	no2=sc.nextInt();
	if(no1>no2){
	System.out.println("No1 is greater then No2");
	}
	else{
	System.out.println("No2 is greater then No1");
	}
}
}