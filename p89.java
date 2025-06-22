/** Given an array of size N where the array elements contain values from 1 to N with
duplicates, the task is to find the total number of subarrays that start and end with
the same element.**/
import java.util.*;
public class p89 {
	public static String maj(int[] arr) {
		Map<Integer,Integer> c = new HashMap<>();
		for(int n : arr) {
			c.put(n, c.getOrDefault(n, 0)+1);
		}List<Map.Entry<Integer, Integer>> l = new ArrayList<>(c.entrySet());
		for(Map.Entry<Integer, Integer> entry : l) {
			if(entry.getValue() >= arr.length/2 )
				return entry.getKey()+"";
		}return "No major element";
	}

	public static void main(String[] args) {
		int arr[] = {2,2,3,5,1};
		System.out.println(maj(arr));

	}

}
