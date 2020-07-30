package trackensure.task3;

import java.util.Arrays;

/**
 * 
 * 
 * @author dovahzul
 *
 */
public class Test3 {
	
	//experimental way, strings can have different length
	public static int testMock(String word1, String word2) {
		
		int operationsCount = 0;
		String current = word1;
		String sample = word2;
		
		System.out.println("Given strings:" + current + "->" + sample);

			if(current.length() <= sample.length()) {
				
				//make closest substring
				operationsCount += sample.length() - current.length();
				
				if(sample.contains(current)) {			
					System.out.println("Current is in sample:" + current + "," + sample);
					return operationsCount;
				}
				for(int i = current.length(); i >= 1; i--) {
					if((sample.contains(current.substring(0, i)))) {
						
						operationsCount += current.length() - i;
						current = current.substring(0, i);
						System.out.println("found current part in substring:" + current);
						//break;
						return operationsCount;
						
					}
					
				}
				
				for(int i = 0; i < current.length(); i++) {
					if(current.charAt(i) != sample.charAt(i)) operationsCount++;
				}
						
			} else if(current.length() > sample.length()) {
				
				//
				System.out.println("Current in bigger than sample");
				return operationsCount;		
			}
				
		return operationsCount;
	}
	
	/**
	 * 
	 * @param word1
	 * @param word2
	 * @return
	 * https://en.wikipedia.org/wiki/Levenshtein_distance
	 */
	public static int test(String word1, String word2) {
		
	    int[][]dp = new int[word1.length() + 1][word2.length() + 1];

	    for (int i = 0; i <= word1.length(); i++) {
	        for (int j = 0; j <= word2.length(); j++) {
	            if (i == 0) {
	                dp[i][j]= j;
	            }
	            else if (j == 0) {
	                dp[i][j]= i;
	            }
	            else {
	                dp[i][j]= min(dp[i - 1][j - 1] + costOfSubstitution(word1.charAt(i - 1), word2.charAt(j - 1)),
	                  dp[i - 1][j]+ 1,
	                  dp[i][j - 1]+ 1);
	            }
	        }
	    }

	    return dp[word1.length()][word2.length()];

	}
	
	 public static int costOfSubstitution(char a, char b) {
	        return a == b ? 0 : 1;
    }
	 
    public static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }
	
	

}
