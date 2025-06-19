import java.util.Arrays;

/**Given an array of integers, return a new array such that each element at index i of
the new array is the product of all the numbers in the original array except the one
at i.**/
public class p67 {
	public static int multiply(int[] arr,int j) {
		int mul = 1;
		for(int i=0;i<arr.length;i++) {
			if(i==j) {
				continue;
			}else {
				mul*=arr[i];
			}
		}return mul;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] mul = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			mul[i] = multiply(arr,i);
		}System.out.println("the generated array is "+Arrays.toString(mul));

	}

}
