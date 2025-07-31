package Package2;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		//we want to print numbers from 1 to 5 usining for loop
      //for(initilazatin; condisation; Updation)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter initial Position");
		int initial = sc.nextInt();
		System.out.println("Enter initial ");
		int Final = sc.nextInt();
		
		for(int i =initial ; i<=Final; i++) {
			
			System.out.println(i );
		}
	}

}
