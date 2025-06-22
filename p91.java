/**Given an array arr[], the task is to find the subarray that has the maximum sum and
return its sum. **/
public class p91 {
	public static int max(int[] arr) {
		int max = 0;
		int c = arr[0];
		for(int i=1;i<arr.length;i++) {
			c = Math.max(arr[i],c+arr[i]);
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {2,3,-8,7,-1,2,3};
		System.out.println(max(arr));

	}

}
