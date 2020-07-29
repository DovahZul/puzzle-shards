package trackensure.task2;

import java.util.Scanner;

import trackensure.task1.Test1;

/**
 * 
 * @author dovahzul
 * original data: {1,8,6,2,5,4,8,3,7}
 */
public class Main {

	public static void main(String[] args) {

		
		int[] testVal = new int[] {1,8,6,2,5,4,8,3,7};
		//Scanner myInput = new Scanner( System.in );
		
		//System.out.println("Specify pool of available elements: ");
		//int testVal = myInput.nextInt();
		
		System.out.println("Maximum availale volume: " + Test2.test(testVal));

	}

}
