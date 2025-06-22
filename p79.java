/** Middle Element in an array.**/
public class p79 {
	public static String mid(int[] ar) {
		if(ar.length%2==1) {
			return ar[ar.length/2]+"";
		}else {
			return ar[ar.length/2 - 1]+","+ar[ar.length/2];
		}
	}

	public static void main(String[] args) {
		int [] ar = {7,2,5,6};
		System.out.println(mid(ar));

	}

}
