package basic;
import java.util.Scanner;
public class SwitchProgram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1=10,no2=20;
		System.out.println("Enter a number from below");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");		
		
		System.out.println("Enter a choice from 1 to 4");
		int choice=sc.nextInt();
		int ans=0;
		switch(choice) {
		case 1:
			ans=no1+no2;
			break;
		case 2:
			ans=no1-no2;
			break;
		case 3:
			ans=no1*no2;
			break;
		case 4:
			ans=no1/no2;
			break;
		default:
			System.out.println("Enter a valid choice from 1 to 4");
			break;
		}
		System.out.println("Ans for your choice is "+ans);
	}

}
