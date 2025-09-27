import java.util.Scanner;
public class Student{
	int rno,std,marks;
	String name;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter rno of student");
		s.rno=sc.nextInt();
		System.out.println("Enter std of student");
		s.std=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of student");
		s.name=sc.nextLine();
		System.out.println("Enter marks of student");
		s.marks=sc.nextInt();
		System.out.println("R.no of student "+s.rno);
		System.out.println("Std of student "+s.std);
		System.out.println("Name of student "+s.name);
		System.out.println("Marks of student "+s.marks);
	}
}