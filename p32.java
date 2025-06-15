/**Stepping Number or Not
Neighbor number difference can be either -1 or 1**/
import java.util.Scanner;

public class p32 {
	public static boolean step(int num) {
		boolean s =true;
		String str = num+"";
		for(int i=0;i<str.length()-1;i++) {
			int tem1 = Integer.parseInt(str.substring(i,i+1));
			int tem2 = Integer.parseInt(str.substring(i+1,i+2));
			if(tem1-tem2 > 1 || tem1-tem2 < -1 || tem1-tem2 ==0)
				return false;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("is it a stepping number");
		int num=sc.nextInt();
		
		System.out.println(step(num));

	}

}
