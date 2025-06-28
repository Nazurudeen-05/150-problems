/** Program to find the matching string and print it in Capitalcase**/
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class p105 {
	public static void miss(String s,String t) {
		String rep = "(?i)"+s.replace("_", ".");
		String arr[] = t.split(":");
		Pattern p = Pattern.compile(rep);
		List<String> l = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			Matcher m =p.matcher(arr[i]);
			if(m.matches()) {
				l.add(arr[i].toUpperCase());
			}
		}System.out.println(String.join(":",l));
	} 

	public static void main(String[] args) {
		String s = "fi_er";
		String t ="Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";
		miss(s,t);
		

	}

}
