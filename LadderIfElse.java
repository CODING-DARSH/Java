import java.util.Scanner;
public class LadderIfElse{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int no1;
	System.out.println("Enter value of no1");
	no1=sc.nextInt();
	if(no1>0){
	System.out.println("No1 is positive number");
	}
	else if(no1<0){
	System.out.println("No1 is negative number");
	}
	else{
	System.out.println("Value of no1 is zero");
	}
}
}