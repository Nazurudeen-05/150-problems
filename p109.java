/**Program to check the strings are anagram **/
import java.util.*;
public class p109 {
	public static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		Map<String,Integer> m1 = new HashMap<>();
		Map<String,Integer> m2 = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			m1.put(s1.substring(i,i+1), m1.getOrDefault(s1.substring(i,i+1), 0)+1);
			m2.put(s2.substring(i,i+1), m2.getOrDefault(s2.substring(i,i+1), 0)+1);
		}return m1.equals(m2);
	}

	public static void main(String[] args) {
		String s1="dogoh";
		String s2 = "godoh";
		System.out.println(anagram(s1,s2));

	}

}
