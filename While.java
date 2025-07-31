//usining While Statement
//if you usining the whil loop you can not close the scanner class
//if you yse the sc.close(); the program can not be exicute proparly
package Package.com;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
	
	System.out.println("Enter a number from 1-5");
	int num = sc.nextInt();
	
	switch(num)
	{
	case 1:	System.out.println("one");
	break;
	case 2:	System.out.println("two");
	break;
	case 3:	System.out.println("three");
	break;
	case 4:	System.out.println("four");
	break;
	case 5:	System.out.println("five");
	break;
	default:System.out.println("number is not found");
	break;
	
			}
		
		}
	}
	
}
