import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Given an integer array find the duplicate element which has the longest distance **/
public class p68 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,1,3,4,2,5,6,1};
		Map<Integer,Integer> freq = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
		list.sort((a,b) -> b.getValue()-a.getValue());
		System.out.println("duplicate element which has longest distance is "+ list.get(0).getKey());
        }
	}


