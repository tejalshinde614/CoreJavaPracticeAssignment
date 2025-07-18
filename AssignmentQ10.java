//Operator Challenge write a program to accept two integers from user
//using scanner and perform all arithamatic operations:+,-,*,/,%,perform 
//comparison:>,<,==,!=
package Package2;

import java.util.Scanner;

public class AssignmentQ10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first number");
	int num1= sc.nextInt();
	System.out.println("Enter a Second number");
	int num2= sc.nextInt();
	
	System.out.println("Arithamatic Operation");
	System.out.println("addition of num1 and num2 is = "+(num1+num2));
	System.out.println("substraction of num1 and num2 is = "+(num1*num2));
	System.out.println("multiplication of num1 and num2 is = "+(num1-num2));
	System.out.println("divition of num1 and num2 is = "+(num1/num2));
	System.out.println("modulas of num1 and num2 is = "+(num1%num2));
	sc.close();
	
	}

}
