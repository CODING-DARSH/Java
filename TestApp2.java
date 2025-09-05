import java.util.Scanner;
public class TestApp2{
	public static void main(String args[]){
	// creating object of Scanner Capital character indicates inbuilt function
	
	Scanner sc=new Scanner(System.in);
	
	int no1,no2,ans;
	//no1=10;
	//no2=20;
	//ans=no1+no2;
	System.out.println("Enter value of no1:");
	no1=sc.nextInt();
	System.out.println("Enter value of no2:");
	no2=sc.nextInt();
	ans=no1+no2;
	System.out.println("no1:"+no1);
	System.out.println("no2:"+no2);
	System.out.println("ans:"+ans);
}
}