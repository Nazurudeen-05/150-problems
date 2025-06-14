/**Program to reverse the number using a loop**/
import java.util.Scanner;
public class p29 {
    public static int rev(int num) {
    	String s=num+"";
    	String rev="";
    	for(int i=s.length()-1;i>=0;i--) {
    		rev+=s.substring(i,i+1);
    	}return Integer.parseInt(rev);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("reversed number: "+rev(num));

	}

}
