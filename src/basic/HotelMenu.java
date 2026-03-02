package basic;
import java.util.Scanner;
public class HotelMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,bill;
		System.out.println("Enter 1 for south indian");
		System.out.println("Enter 2 for gujarati");		
		System.out.println("Enter 3 for North indian");
		int menuSelection=sc.nextInt();
		switch(menuSelection) {
		case 1:
			System.out.println("Enter 1 for dosa each costs 80rs/-");
			System.out.println("Enter 2 for Idli each costs 20rs/-");
			System.out.println("Enter 3 for maidu vada each costs 30rs/-");
			int sChoice=sc.nextInt();
			int sqty=sc.nextInt();
			break;
		case 2:
			System.out.println("Enter 1 for dhokla each plate costs 50rs/- ");
	}
	}
}
