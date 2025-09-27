import java.util.Scanner;
public class AccessDetails2{
	public static void main(String args[]){
		Student1 s[]=new Student1[5];
		for(int i=0;i<s.length;i++){
		s[i]=new Student1();
		s[i].scanData();	
	}
		for(int i=0;i<s.length;i++){
		s[i].displayData();
}
	}	
}