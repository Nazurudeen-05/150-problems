/** Given an integer array using searching element place the incremented number
next to searching number**/
import java .util.*;
public class p69 {

	public static void main(String[] args) {
		int[] arr = {10,20,10,30,14,40,60,10};
		int search = 10;
		Map<Integer,Integer> count = new HashMap<>();
		for(int nums : arr) {
			count.put(nums,count.getOrDefault(nums, 0)+1);
		}int ex = count.get(search);
        int[] incre = new int[arr.length + ex];
        int j =1;int c=0;
        for(int nums : arr) {
        	if(nums == search) {
        		incre[c]=nums;
        		c++;
        		incre[c]=j;
        		c++;
        		j++;
        	}else {
        		incre[c]=nums;
        		c++;
        	}
        }System.out.println(Arrays.toString(incre));
	}

}
