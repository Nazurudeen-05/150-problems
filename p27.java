/**Arrangement of odd sequence followed by even sequence**/
import java.util.Scanner;
public class p27 {
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
		}return Integer.parseInt(odd+even);
	}
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("odd sequence followed by even sequence: "+odd(num));
	}
}
