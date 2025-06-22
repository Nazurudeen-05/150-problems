/**Find common elements between 2 arrays. **/
public class p81 {
	public static void com(int[] arr1,int[]arr2) {
		for(int nums : arr1) {
			for(int i=0;i<arr2.length;i++) {
				if(nums == arr2[i])
                       System.out.print(nums+" ");
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {2,4,6,8};
		com(arr1,arr2);

	}

}
