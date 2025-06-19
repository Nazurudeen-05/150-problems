import java.util.Arrays;

/**Re-arranged array by small – largest combination**/
public class p58 {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,4,5,6,8,9};
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        int start =0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++) {
        	if(i%2==0) {
        		res[i]=arr[start];
        		start++;
        	}else {
        		res[i]=arr[end];
        		end--;
        	}
        }System.out.println(Arrays.toString(res));
	}

}
