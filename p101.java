/** Highest frequency character in aString**/ 
import java.util.*;
public class p101 {

	public static void main(String[] args) {
		String  s = "engineering";
		Map<String,Integer> m = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			m.put(s.substring(i,i+1),m.getOrDefault(s.substring(i,i+1), 0)+1);
		}List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
		l.sort((a,b) -> b.getValue() - a.getValue());
		
			System.out.println(l.get(0).getKey() + ":" + l.get(0).getValue());
		
		

	}

}
