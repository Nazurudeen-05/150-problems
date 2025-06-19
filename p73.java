/**Finding Frequency of Duplicate elements in an array **/
import java.util.*;
public class p73 {

	public static void main(String[] args) {
		int arr[]= {10,10,10,20,20,5};
		Map<Integer,Integer> freq = new HashMap<>();
		for(int nums : arr) {
		    freq.put(nums,freq.getOrDefault(nums,0)+1);
		}
		List<Map.Entry<Integer,Integer>> li = new ArrayList<>(freq.entrySet());
		for(Map.Entry<Integer, Integer> entry : li) {
			if(entry.getValue() >1) {
				System.out.println(entry.getKey() +"->" + entry.getValue());
			}
		}

	}

}
