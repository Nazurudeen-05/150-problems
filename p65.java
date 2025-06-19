/**Max contiguous Subarray**/
public class p65 {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int len = arr.length;
		int maxs=arr[0];
		int currents=arr[0];
		for(int i=0;i<len;i++) {
			currents=Math.max(arr[i], currents + arr[i]);
			maxs = Math.max(maxs,currents);
		}
        System.out.println("Max contiguous sum of sub array are "+ maxs);
	}

}
