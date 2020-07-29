package trackensure.task1;

import java.util.Scanner;

/**
 * 
 * @author dovahzul
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner( System.in );
		
		System.out.println("Specify pool of available elements: ");
		int testVal = myInput.nextInt();
		
		System.out.println("Is possible to create full rows: " + Test1.test(testVal));

	}

}
