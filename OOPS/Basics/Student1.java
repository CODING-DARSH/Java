import java.util.Scanner;
public class Student1{
	int rno,std,marks;
	String name;
	public void scanData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rno of student");
	rno=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Name of student");
	name=sc.nextLine();
	System.out.println("Enter Marks of student");
	marks=sc.nextInt();
	System.out.println("Enter std of student");
	std=sc.nextInt();
}
	public void displayData(){
	System.out.println("Rno of student is "+rno);
	System.out.println("Name of student is "+name);
	System.out.println("std of student is "+std);
	System.out.println("Marks of student is "+marks);
	}
}