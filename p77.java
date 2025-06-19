import java.util.Arrays;

/**Delete an element from an array**/
public class p77 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int pos =2;
		int[] rem = new int[arr.length-1];
		int j =0;
		for(int i=0;i<arr.length;i++) {
			if(i==pos-1) {
				continue;
			}else {
				rem[j]=arr[i];
				j++;
			}
		}System.out.println(Arrays.toString(rem));

	}

}
