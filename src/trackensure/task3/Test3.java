package trackensure.task3;

/**
 * 
 * 
 * @author dovahzul
 *
 */
public class Test3 {
	
	//first way, strings can have different length
	public static int test(String word1, String word2) {
		
		int operationsCount = 0;
		String current = word1;
		String sample = word2;
		
		System.out.println("Given strings:" + current + "->" + sample);
		//while(current != sample) {
			

			
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
				
				
				
				
				
				
			
			
		//}
		
		
		
		return operationsCount;
	}

}
