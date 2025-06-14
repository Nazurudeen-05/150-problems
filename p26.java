/**Program to print the sum of odd numbers and arrangement of odd sequence**/
import java.util.Scanner;
public class p26 {
	public static int odd(int num) {
		int sum =0;
		String s= num+"";
		String oddseq="";
		String evenseq="";
		while(num!=0){
			int tem = num%10;
			if(tem%2==1) 
				sum+=tem;
			num/=10;
		}
		for(int j=0;j<s.length();j++) {
			int temp = Integer.parseInt(s.substring(j,j+1));
			if(temp%2==1)
				oddseq+=String.valueOf(temp);
			else
				evenseq+=String.valueOf(temp);
		}
		System.out.println("Arrangement of odd sequence: "+oddseq+evenseq);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Sum of odd numbers: "+odd(num));
	}
}
