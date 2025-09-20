import java.util.Scanner;
public class Arraydemo7{
	public static void main(String args[]){
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
		System.out.println("Enter value of a["+i+"]");
		a[i]=sc.nextInt();
	}
	System.out.println("Odd numbers are");
	for(int i=0;i<5;i++){
		if(a[i]%2==1){
		System.out.println("Value of a["+i+"]"+a[i]);
}
	}
}
}