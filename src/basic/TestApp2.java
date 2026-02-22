package basic;
import java.util.Scanner;
public class TestApp2 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number 1:");
			int no1 =sc.nextInt();
			System.out.println("Enter number 2:");
			int no2 =sc.nextInt();
			System.out.println("Addition of no1 and no2 :"+ (no1+no2) );
			System.out.println("Subtraction of no1 and no2 :"+ (no1-no2) );
			System.out.println("Divison of no1 and no2 :"+ (no1/no2) );
			System.out.println("Multiplication of no1 and no2 :"+ (no1*no2) );
	}

}
