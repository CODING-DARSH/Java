package IfElse;
import java.util.Scanner;
public class MarkSheet{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int maths,sci,ss,total,avg;
	System.out.println("Enter marks of Maths");
	maths=sc.nextInt();
	System.out.println("Enter marks of Science");
	sci=sc.nextInt();
	System.out.println("Enter marks of SS");
	ss=sc.nextInt();
	total=maths+sci+ss;
	avg=total/3;
	if(avg>90){
	System.out.println("A+ grade");
	}
	else if(avg>80){
	System.out.println("A grade");
	}
	else if(avg>70){
	System.out.println("B+ grade");
	}
	else if(avg>60){
	System.out.println("B grade");
	}
	else if(avg>50){
	System.out.println("C grade");
	}
	else{
	System.out.println("You failed");
	}
}
}