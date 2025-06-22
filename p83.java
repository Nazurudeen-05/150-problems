/** Given an array nums of distinct integers, return all the possible permutations. You
can return the answer in any order. **/
import java.util.*;
public class p83 {
	public static void back(List<List<Integer>> res,ArrayList<Integer> tem,int[] n) {
		if(tem.size()==n.length) {
			res.add(new ArrayList<>(tem));
			return;
		}for(int nums : n) {
			if(tem.contains(nums))
				continue;
			tem.add(nums);
			back(res,tem,n);
			tem.remove(tem.size()-1);
		}
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		List<List<Integer>> res = new ArrayList<>();
		back(res,new ArrayList<>(),nums);
		System.out.println(res);

	}

}
