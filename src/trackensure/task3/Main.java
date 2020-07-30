package trackensure.task3;

import trackensure.task3.Test3;

/**
 * 
 * @author dovahzul
 * 
 *
 */
public class Main {


		public static void main(String[] args) {

			
			String word1 = new String();
			String word2 = new String();
			//Scanner myInput = new Scanner( System.in );
			word2 = "qwere";
			word1 = "horse";
			
			//System.out.println("");
			
			System.out.println("Minimum needed operations: " + Test3.test(word1, word2));

		}

}
