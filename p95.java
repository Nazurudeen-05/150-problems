/** max of each sub array of given length**/
import java.util.*;
public class p95 {
	public static List<Integer> sub(int[] arr, int k){
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<=arr.length-k;i++) {
			int tem = arr[i];
			for(int j=i+1;j<=i+2;j++) {
				if(arr[j]>tem) {
					tem=arr[j];
				}
			}l.add(tem);
		}return l;
	}

	public static void main(String[] args) {
		int arr[] = {10,5,2,7,8,7};
		int k =3;
		System.out.println(sub(arr,k));

	}

}
