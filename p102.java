import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Program to print the frequency count from highest to lowest**/
public class p102 {

	public static void main(String[] args) {
		String  s = "engineering";
		HashMap<String,Integer> m = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			m.put(s.substring(i,i+1),m.getOrDefault(s.substring(i,i+1), 0)+1);
		}List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
		l.sort((a,b) -> b.getValue() - a.getValue());
		for(Map.Entry<String, Integer> e : l) {
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}

}
