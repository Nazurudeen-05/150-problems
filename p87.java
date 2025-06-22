/** Given an array of integers greater than zero, find if it is possible to split it in two
subarrays (without reordering the elements), such that the sum of the two
subarrays is the same. Print the two subarrays. **/
import java.util.*;
public class p87 {
	public static void sub(int[]arr,int t) {
		List<Integer> left = new ArrayList<>();
		List<Integer> Right = new ArrayList<>();
		int l =0;
		boolean b =false;
		for(int i=0;i<arr.length-1;i++) {
			l+=arr[i];
			int r = t-l;
			if(l==r) {
				for(int j=0;j<=i;j++) {
					left.add(arr[j]);
				}
				for(int j=i+1;j<arr.length;j++) {
					Right.add(arr[j]);
				}b=true;
				System.out.println(left);
				System.out.println(Right);
			}
		}if(!b)
			System.out.println("no subarray exists");
	}

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,1};
		int tot = 0;
		for(int nums : arr) {
			tot+=nums;
		}
		sub(arr,tot);

	}

}
