/** **/
public class p71 {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4};
		 int maxSoFar = arr[0];
	        int currentMax = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currentMax = Math.min(arr[i], currentMax + arr[i]);
	            maxSoFar = Math.min(maxSoFar, currentMax);
	        }
		
       System.out.println("Maximum sum of sub array is :"+ maxSoFar);

	}

}
