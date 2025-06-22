/**Given an array arr[] of size n and an integer k, the task is to insert a duplicate of k
adjacent to its every occurrence. Keep array's original length same by removing the
elements from the back. **/
import java.util.*;
public class p90 {
	public static List<Integer> change(int[] arr,int len,int k) {
		List <Integer> l = new ArrayList<>();
		for(int n : arr) {
			if(l.size()==len)
				break;
			if(n==k) {
				l.add(n);
				l.add(k);
			}else {
				l.add(n);
			}
		}return l;
	}

	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,5,0};
		int len = arr.length;
		int k =0 ;
		System.out.println(change(arr,len,k));

	}

}
