/**2 digit reduced subtracted form**/
import java.util.Scanner;
public class p25 {
	public static int red(int num) {
		String s = num+"";
		String og = "";
		int i=0;
		while(i<s.length()-1) {
			int t1=Integer.parseInt(s.substring(i,i+1))-Integer.parseInt(s.substring(i+1,i+2));
			t1=t1<0?t1*-1:t1;
			og+=String.valueOf(t1);
			i++;
			if(i==s.length()-1 && og.length()>2) {
				s=og;
				og="";
				i=0;
			}
		}
		System.out.print("the reduced digit is ");
		return Integer.parseInt(og);
	}
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(red(num));
	}
}
