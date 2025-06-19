/**Program to find the frequency count of every number in an array in ascending
order**/
import java.util.*;
public class p63 {

	public static void main(String[] args) {
		int[] arr= {40,20,10,20,40,40,30};
		Map<Integer,Integer> freq = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
		list.sort((a,b) -> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry : list) {
        	System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
	}
	}


