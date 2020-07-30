package trackensure.task2;

/**
 * 
 * 
 * @author dovahzul
 * 
 *
 */

public class Test2 {
	
	// first way
	public static int test(int[] height) {
	int volume = 0;
	
	for(int i = 1; i < height.length; i++) {
		for(int j = 1; j < height.length; j++) {
			int supposedVolume = (Math.min(height[i], height[j]) * Math.abs(i - j));
			System.out.println("supposedVolume:" + supposedVolume + " " + i + " " + j);
			if(volume < supposedVolume) {
				volume = supposedVolume;
				
			}
		}
	}
	
	
	return volume;
	}

}
