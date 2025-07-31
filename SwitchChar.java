//usining Char
package Package.com;
import java.util.Scanner;
public class SwitchChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	System.out.println("Enter a character from A-D");
	String ch = sc.next();
	
	switch(ch)
	{
	case "A":	System.out.println("Tejal");
	break;
	case "B":	System.out.println("Shravani");
	break;
	case "C":	System.out.println("Pratiksha");
	break;
	case "D":	System.out.println("Akanksha");
	break;
	default:System.out.println("String  is not found");
	break;
			}
	sc.close();	
		}
	}
	

