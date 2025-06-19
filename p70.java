/**Maximum subarray sum **/
import java.util.*;
public class p70 {

	public static void main(String[] args) {
		int[] arr = {2,3,-8,7,-1,2,3};
		 int maxSoFar = arr[0];
	        int currentMax = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currentMax = Math.max(arr[i], currentMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currentMax);
	        }
		
        System.out.println("Maximum sum of sub array is :"+ maxSoFar);
	}
}

