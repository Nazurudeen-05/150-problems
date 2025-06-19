import java.util.Arrays;

/** reverse array**/
public class p72 {

	public static void main(String[] args) {
		int[] ar = {4,5,2,1};
		int[] rev =new int[ar.length];
		int st =0;
		for(int i=ar.length-1;i>=0;i--) {
			rev[st]=ar[i];
			st++;
		}System.out.println("Reversed array is "+Arrays.toString(rev));

	}

}
