/** Given an array of size N where the array elements contain values from 1 to N with
duplicates, the task is to find the total number of subarrays that start and end with
the same element.**/
public class p88 {
	public static int sub(int[] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j])
					c+=1;
			}
		}return c;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,1,5,2};
		System.out.println(sub(arr));

	}

}
