/** Check if 2 Arrays are equal or not. **/
import java.util.*;
public class p78 {
	public static boolean bool(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length)
			 return false;
		boolean[] b = new boolean[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			boolean f = false;
			for(int j=0;j<arr2.length;j++) {
				if(!b[j] && arr1[i]==arr2[j]) {
					b[j] =true;
					f=true;
					break;
				}
			}if(!f)
				return false;
		}return true;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,5,0};
		int[] arr2 = {0,5,4,2,1};
		boolean ret = bool(arr1,arr2);
		
		System.out.println(ret);

	}

}
