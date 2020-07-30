package trackensure.task1;

/**
 * 
 * @author dovahzul
 * 
 * Test1
 *
 */
public class Test1 {
	
	public static int test(int val) {
		
		int result = 0;		
		int pool = val;
		
		for(int i = 1; i <= pool; i += 1) {
			System.out.println("Going row:" + i + " Avaialble pool: " + (pool - i));
			result += 1;
			pool -= i;
		}
		
		return result;
	}

}
