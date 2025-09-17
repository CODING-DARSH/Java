import java.util.Scanner;
public class Arraydemo2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int a[]=new int[5];
	for(int i=0;i<a.length;i++){
	System.out.println("Enter value for a["+i+"]");
	a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++){
	sum+=a[i];
		System.out.println("Value of a["+i+"]:"+a[i]);		
	}
	System.out.println("Sum is "+sum);
	}
} 