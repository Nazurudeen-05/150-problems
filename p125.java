import java.util.*;

/**print the highest frequency followed by lowest **/
public class p125 {

	public static void main(String[] args) {
		String s = "programming";
		String low="";
		String high="";
		LinkedHashMap<String,Integer> l = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
			l.put(s.substring(i,i+1), l.getOrDefault(s.substring(i,i+1), 0)+1);
		for(Map.Entry<String,Integer> e : l.entrySet()) {
			if(e.getValue()>1)
				high+=e.getKey()+" ";
			else
				low+=e.getKey()+" ";
		}System.out.println("highest freq characters : "+high);
		System.out.println("lowest freq characters : "+low);

	}

}
