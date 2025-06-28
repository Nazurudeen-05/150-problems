/**First Non-Repeated character in a String **/
import java.util.*;
public class p117 {

	public static void main(String[] args) {
		String s = "racecar";
		String nonrepeated="";
		Map<String,Integer> m = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			m.put(s.substring(i,i+1), m.getOrDefault(s.substring(i,i+1), 0)+1);
		}
		for(Map.Entry<String, Integer> e : m.entrySet()) {
			if(e.getValue()==1) {
				nonrepeated+=e.getKey();
				break;
			}
		}System.out.println(nonrepeated);
	}

}
