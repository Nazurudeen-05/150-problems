import java.util.Arrays;

/**Group reverse**/
public class p61 {
	public static void groupreverse(int[] arr,int d) {
		int len = arr.length;
		for(int i=len-d;i>=0;i-=d) {
			reverse(arr,i,i+d-1);
		}System.out.println("reversed group is ");
	}
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int tem = arr[start];
			arr[start]=arr[end];
			arr[end]=tem;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,25,35,45};
		int d = 4;
		groupreverse(a,d);
        System.out.println(Arrays.toString(a));
	}

}
