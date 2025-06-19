/**Find distinct elements in an array **/
import java.util.*;
public class p75 {

	public static void main(String[] args) {
		int[] arr= {10,20,10,20,2,3};
		Set<Integer> s = new TreeSet<>(); 
		for(int nums:arr) {
			s.add(nums);
		}System.out.println(s);

	}

}
