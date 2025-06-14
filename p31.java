/**Problem to check whether all the numbers are arranged in ascending order**/
import java.util.Arrays;
import java.util.Scanner;
public class p31 {
	public static boolean sort(int num) {
		String s = num+"";
		int[] arr=new int[s.length()];
		int[] sorted = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=Integer.parseInt(s.substring(i,i+1));
			sorted[i]=Integer.parseInt(s.substring(i,i+1));
		}
		Arrays.sort(sorted);
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=sorted[j])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is the numbers arranged in ascending order");
		int num=sc.nextInt();
		System.out.println(sort(num));

	}

}
