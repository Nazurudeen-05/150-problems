import java.util.HashMap;
import java.util.Map;

/**Check Whether Two Strings Are Anagram **/
public class p121 {
	public static void anagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			System.out.println("not a anagram");
		Map<String,Integer> m1 = new HashMap<>();
		Map<String,Integer> m2 = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			m1.put(s1.substring(i,i+1), m1.getOrDefault(s1.substring(i,i+1), 0)+1);
			m2.put(s2.substring(i,i+1), m2.getOrDefault(s2.substring(i,i+1), 0)+1);
		}if (m1.equals(m2))
			System.out.println("is anagram");
		else
			System.out.println("not a anagram");
	}

	public static void main(String[] args) {
		String s1="dogo";
		String s2="godo";
		anagram(s1,s2);

	}

}
