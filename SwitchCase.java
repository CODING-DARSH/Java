import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no1, no2;

        System.out.println("Enter no1");
        no1 = sc.nextInt();

        System.out.println("Enter no2");
        no2 = sc.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition of " + no1 + " and " + no2 + " is " + (no1 + no2));
                break;
            case 2:
                System.out.println("Subtraction of " + no1 + " and " + no2 + " is " + (no1 - no2));
                break;
            case 3:
                System.out.println("Multiplication of " + no1 + " and " + no2 + " is " + (no1 * no2));
                break;
            case 4:
               System.out.println("Division of " + no1 + " and " + no2 + " is " + (no1 / no2));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

