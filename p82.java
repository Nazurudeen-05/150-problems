/**Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target. **/
import java.util.*;
public class p82 {
	public static int[] c(int[] arr,int t) {
	    Map<Integer,Integer> m = new HashMap<>();
	    for(int i=0;i<arr.length;i++) {
	    	int com = t-arr[i];
	    	if(m.containsKey(com)) {
	    		return new int[] {m.get(com),i};
	    	}
	    	m.put(arr[i], i);
	    }return  new int[] {};
	}

	public static void main(String[] args) {
		int[] arr= {0,-1,2,-3,1};
		int target = -2;
		System.out.println(Arrays.toString(c(arr,target)));

	}

}
