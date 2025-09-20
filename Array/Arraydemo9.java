import java.util.Scanner;
public class Arraydemo9{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int numbersearch,found=0;
	for(int i=0;i<10;i++){
	System.out.println("Enter value of a["+i+"]");
	a[i]=sc.nextInt();
	}
	System.out.println("Enter number you want to search in array");
	numbersearch=sc.nextInt();
	for(int i=0;i<10;i++){
		if(numbersearch==a[i]){
			System.out.println(numbersearch+" is found in array");
			found=1;
		}
	}
	if(found==0){
		System.out.println(numbersearch+" isnt found in array");
	}
}
}