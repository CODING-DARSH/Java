package basic;
import java.util.Scanner;
public class ForLoop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter a number");
		int num=sc.nextInt();
	int i=1;
	while(i<=10) {
		System.out.println(num +"*"+ i+"="+ num*i);
		i++;
	}
	}

}
