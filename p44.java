/**Pattern Programs**/
public class p44 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			int s=1;
			for(int j=1;j<=5;j++) {
				if(j<=n-1)
				System.out.print(" ");
				else {
					System.out.print(s);
					s++;
				}
			}n--;
			System.out.println();
		}

	}
}
