//Student Informesation program write a program to take input for  
//name age gender and percentage Usining Scanner decler appropriate 
//data typeds print all values using a method 
package Package2;

import java.util.Scanner;

public class AssignmentQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill The Student Informesation Form ");
		
		System.out.println("Enter Student Name =");
		String name = sc.next();

		System.out.println("Enter Student Age =");
		int age =sc.nextInt();
		
		System.out.println("Enter Student Gender =");
		String gender = sc.next();
	
		System.out.println("Enter Student Percentage =");
		float percentage = sc.nextFloat();
		
		System.out.println("Fill The Student Informesation Form ");
		System.out.println(" ");
		System.out.println(" Student Name is ="+name);
		System.out.println(" Student Age is ="+age);
		System.out.println(" Student Gender is ="+gender);
		System.out.println(" Student Percentage is ="+percentage);
		
		sc.close();
	}
}
