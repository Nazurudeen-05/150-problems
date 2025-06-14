/**Problem to count the total number of odd and even in the given any digit number**/
import java.util.Scanner;
public class p30 {
    public static void count(int num) {
    	int odd=0;
    	int even=0;
    	while(num!=0) {
    		int tem = num%10;
    		if(tem%2==0)
    			even++;
    		else
    			odd++;
    		num/=10;
    	}System.out.println("odd numbers count: "+odd);
    	System.out.println("even numbers count: "+even);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		count(num);

	}

}
