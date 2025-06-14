/**Arrangement of odd sequence with count followed by even sequence with count**/
import java.util.Scanner;
public class p28 {
	public static int odd(int num) {
		String s=num+"";
		String odd="";
		String even="";
		for (int i=0;i<s.length();i++) {
			int temp = Integer.parseInt(s.substring(i,i+1));
			if(temp%2==1)
				odd+=String.valueOf(temp);
			else
				even+=String.valueOf(temp);
		}
		String og=odd+odd.length()+even+even.length();
		return Integer.parseInt(og);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("odd sequence with count followed by even sequence: "+odd(num));
	}
}
