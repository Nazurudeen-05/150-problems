import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Finding frequency of Unique elements in an array**/
public class p74 {

	public static void main(String[] args) {
		int arr[]= {10,10,10,20,20,5};
		Map<Integer,Integer> freq = new HashMap<>();
		for(int nums : arr) {
		    freq.put(nums,freq.getOrDefault(nums,0)+1);
		}
		List<Map.Entry<Integer,Integer>> li = new ArrayList<>(freq.entrySet());
		for(Map.Entry<Integer, Integer> entry : li) {
			if(entry.getValue() ==1) {
				System.out.println(entry.getKey() +"->" + entry.getValue());
			}
		}
	}
}
		

	


