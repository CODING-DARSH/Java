import java.util.Scanner;
public class MaxNum{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int no1,no2,no3;
	System.out.println("Enter value of no1");
	no1=sc.nextInt();
	System.out.println("Enter value of no2");
	no2=sc.nextInt();
	System.out.println("Enter value of no3");
	no3=sc.nextInt();
	if(no1>no2){
		if(no1>no3){
		System.out.println("No1 is max "+no1);
		}
		else{
		System.out.println("No3 is max "+no3);	
		}
	}
	else if(no2>no3){
		if(no3>no2){ 
		System.out.println("No3 is max "+no3);
		}
		else{
		System.out.println("No2 is max"+no2);
		}
	}
	else if(no1==no3 && no2==no3){
	System.out.println("All numbers are same");

	}
	else if (no1==no2){
		if(no1==no2 && no1>no3){
			System.out.println("No1 and no2 are same and both are greater then no3");
		}
		else{
			System.out.println("No1 and no2 are same and both are lesser then no3");
		}
	}
	else if (no2==no3){
		if(no2==no3 && no2>no1){
			System.out.println("No2 and no3 are same and both are greater then no1");
		}
		else{
			System.out.println("No2 and no3 are same and both are lesser then no1");
		}
	}
	else if (no3==no1){
		if(no1==no3 && no1>no2){
			System.out.println("No1 and no3 are same and both are greater then no2");
		}
		else{
			System.out.println("No1 and no3 are same and both are lesser then no2");
		}
	}
}
}