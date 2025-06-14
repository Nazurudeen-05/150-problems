/**A number is said to be a magic number, if the sum of its digits are calculated till a
single digit recursively by adding the sum of the digits after every addition. If the
single digit comes out to be 1,then the number is a magic number.**/
import java.util.Scanner;
public class problem24 {
	public static void magic(int num) {
		int sum=0;
		while(num!=0) {
			int tem = num%10;
			sum+=tem;
			num/=10;
			if(num==0 && sum>9) {
				num=sum;
				sum=0;
			}
		}
		if(sum==1)
			System.out.println("this is a magic number");
		else
			System.out.println("this is not a magic number");
	}
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		magic(num);
	}
}
