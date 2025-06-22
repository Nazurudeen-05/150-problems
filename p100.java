/** String Encoding**/
import java.util.*;
public class p100 {
	public static void encode(String s) {
		Map<String,Integer> m = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
				
			m.put(s.substring(i,i+1),m.getOrDefault(s.substring(i,i+1),0)+1);
		}
		List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
		for(Map.Entry<String, Integer> entry : l) {
			System.out.print(entry.getKey()+entry.getValue());
		}
	}

	public static void main(String[] args) {
		String s = "aaaabbcccdddd";
		encode(s);
	}

}
