import java.util.Arrays;

/**Rotate an array by ‘N’ positions**/
public class p66 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int pos = 2;
		int len = arr.length;
		int[] rotated = new int[len];
		int i =0;
		while(i != len) {
			if(i<pos) {
				rotated[i+len-pos]=arr[i];
			}else {
				rotated[i-pos]=arr[i];
			}i++;
		}
		System.out.println("the rotated array is "+ Arrays.toString(rotated));

	}

}
